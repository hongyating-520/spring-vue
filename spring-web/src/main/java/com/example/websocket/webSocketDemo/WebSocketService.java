package com.example.websocket.webSocketDemo;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.UUID;

/*
 * @author ZZQ
 * @Date 2021/10/18 11:01 上午
 */
@ServerEndpoint("/wwebSocket")
@Component
public class WebSocketService {
    private Session session;
    //建立连接成功调用
    @OnOpen
    public void onOpen(Session session){
        System.out.println("websocket链接开启：sid______"+session.getId());
        try {
            session = session;
            while (true){
                Thread.sleep(3000);
                session.getBasicRemote().sendText("send__message__"+ UUID.randomUUID().toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //收到客户端信息处理
    @OnMessage
    public void onMessage(String message) throws IOException{
        message = "客户端：" + message + ",已收到";
        System.out.println(message);
        session.getBasicRemote().sendText("send__message__"+ UUID.randomUUID().toString());
    }

    //关闭连接时调用
    @OnClose
    public void onClose(@PathParam(value = "sid") String sid){
        System.out.println("链接关闭：sid_____"+sid);
    }
    //错误时调用
    @OnError
    public void onError(Session session, Throwable throwable) throws IOException {
        System.out.println("发生错误"+throwable.getMessage());
        session.getBasicRemote().sendText("发生错误//////");
    }
}
