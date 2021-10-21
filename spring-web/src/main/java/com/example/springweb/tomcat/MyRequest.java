package com.example.springweb.tomcat;

import org.apache.catalina.startup.Constants;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * @author ZZQ
 * @Date 2021/7/4 1:53 下午
 */
public class MyRequest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AsyncContext asyncContext = req.startAsync();
        asyncContext.start(new Runnable() {
            @Override
            public void run() {
                asyncContext.setTimeout(100L);
                asyncContext.complete();
            }
        });
    }

    public static void main(String[] args) throws MalformedURLException {
        String userDir = System.getProperty("user.dir");
        System.out.println(userDir);
        // Home first
        String home = System.getProperty(Constants.CATALINA_HOME_PROP);
        System.out.println(home);
        File file = new File("/Users/mima0000/java_project/spring-vue/spring-server/target/classes/mapper/UserStoreSettingDao.xml");
        System.out.println(file.toURI().toString());
        //appclassloader:加载classpash路径的类
        URL url = new URL(file.toURI().toString());
        System.out.println(url);
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

    }
}
