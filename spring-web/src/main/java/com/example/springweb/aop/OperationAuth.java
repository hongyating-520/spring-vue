package com.example.springweb.aop;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * @author mima0000
 */ /*
 * @author ZZQ
 * @Date 2021/7/29 1:39 下午
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OperationAuth {

    String service() default  "";
    String method() default "";
    String[] args() default "";
    int index() default 0;
}
