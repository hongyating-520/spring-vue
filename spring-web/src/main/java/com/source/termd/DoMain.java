package com.source.termd;

import com.source.termd.events.EventsExample;
import com.source.termd.events.WebsocketEventsExample;
import io.termd.core.http.netty.NettyWebsocketTtyBootstrap;
import io.termd.core.ssh.TtyCommand;
import io.termd.core.telnet.netty.NettyTelnetTtyBootstrap;
import io.termd.core.tty.TtyConnection;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * @author ZZQ
 * @Date 2021/7/29 11:18 下午
 */
public class DoMain {
    public synchronized static void main(String[] args) throws Throwable {
        NettyWebsocketTtyBootstrap bootstrap = new NettyWebsocketTtyBootstrap().setHost("localhost").setPort(4000);
        bootstrap.start(EventsExample::handle).get(10, TimeUnit.SECONDS);
        System.out.println("Telnet server started on localhost:4000");
        WebsocketEventsExample.class.wait();
    }



        public static void handle(TtyConnection conn) {
            conn.setEventHandler((event, key) -> {
                switch (event) {
                    case INTR:
                        conn.write("You did a Ctrl-C\n");
                        break;
                    case SUSP:
                        conn.write("You did a Ctrl-Z\n");
                        break;
                    case EOF:
                        conn.write("You did a Ctrl-D: closing\n");
                        conn.close();
                        break;
                }
            });

            conn.setSizeHandler(size -> {
                conn.write("You resized your terminal to " + size + "\n");
            });

            conn.setTerminalTypeHandler(term -> {
                conn.write("Your terminal is " + term + "\n");
            });

            conn.setStdinHandler(keys -> {
                for (int key : keys) {
                    conn.write("You typed " + key + "\n");
                }
            });
        }


        public void doCommond(){
         //可以结合Scanner input=new Scanner(System.in);获取控制台命令
            try {
                //执行控制台命令：ls -a并读取相关结果
                Process p = Runtime.getRuntime().exec("ls -a");
                InputStreamReader ir =new InputStreamReader(p.getInputStream());
                LineNumberReader input =new LineNumberReader (ir);     //创建IO管道，准备输出命令执行后的显示内容
                String line;
                while ((line = input.readLine ()) !=null){    //按行打印输出内容
                    System.out.println(line);    }

            }catch (IOException e1) {
                e1.printStackTrace();
            }
        }

}
