package com.example.springweb.jasypt.proyx.test;

import com.example.springweb.SpringWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
 * @author ZZQ
 * @Date 2021/7/26 4:15 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringWebApplication.class)
public class TestDemo {

    @Value("${myservice.test.password}")
    private String password;

    @Autowired
    MyConfigClass myConfigClass;

    @Test
    public void configTest(){
        System.out.println(password);
        System.out.println(myConfigClass.getPassword());
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
