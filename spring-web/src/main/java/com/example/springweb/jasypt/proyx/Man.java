package com.example.springweb.jasypt.proyx;

/*
 * @author ZZQ
 * @Date 2021/7/23 10:11 上午
 */
public class Man implements Person{
    @Override
    public String eat(String someThing) {
        System.out.println("执行代理方法-->吃："+someThing);
        return someThing;
    }
}
