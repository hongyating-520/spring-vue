package com.example.springweb;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*
 * @author ZZQ
 * @Date 2021/6/21 12:59 下午
 */
    public class UserInfo {
        private String username;
        private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        try {
            for (;;){
                List<UserInfo> list = new ArrayList<>();
                int count = 1;
                cycle(list,count);
            }
        }catch (Throwable e){
            System.out.println("出现异常了");
        }finally {
            System.out.println("异常情况结束");
        }

    }
    public static void cycle(List<UserInfo> list,Integer count){
        ++count;
        UserInfo userInfo = new UserInfo();
        String s = UUID.randomUUID().toString();
        userInfo.setPassword(s);
        userInfo.setUsername(s);
        list.add(userInfo);
        System.out.println("--------stack:"+count);
        cycle(list,count);
    };
}
