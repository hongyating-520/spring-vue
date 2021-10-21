package com.example.springweb.aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
 * @author ZZQ
 * @Date 2021/10/21 3:03 下午
 */
public class AopContext {
    //循环依赖导致事务失效或者其他轻缓：或者其他可以使用代理对象直接调用方法
    //@EnableAspectJAutoProxy(exposeProxy = true) AopContext.currentProxy()
}
