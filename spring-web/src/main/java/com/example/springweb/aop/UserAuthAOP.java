package com.example.springweb.aop;

import com.example.springweb.interceptor.FontInterceptor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * @author ZZQ
 * @Date 2021/7/29 11:32 上午
 */
//@Component
//@Aspect
public class UserAuthAOP implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    @Before("execution(* com.example.springweb.controller..*(..))")
    public void beforeServiceCall(JoinPoint joinpoint) throws Exception {

        MethodSignature signature = (MethodSignature) joinpoint.getSignature();
        Method method = signature.getMethod();
        OperationAuth auth = method.getDeclaredAnnotation(OperationAuth.class);
        if (auth ==null){
            return;
        }
        Object bean = context.getBean(auth.service());
        Method[] methods = bean.getClass().getDeclaredMethods();
        Method sMethod = null;
        for (Method m : methods) {
            if (m.getName().equals(auth.method())){
                sMethod = m;
            };
        }
        if (sMethod ==null){
            return;
        }

        Object[] sArgs = new Object[auth.args().length];
        Object param = joinpoint.getArgs()[auth.index()];
        for (int i = 0;i<auth.args().length;i++){
            Field field = param.getClass().getDeclaredField(auth.args()[i]);
            field.setAccessible(true);
            sArgs[i] = field.get(param);
        }
        Object invoke = sMethod.invoke(bean, sArgs);
        Field userId = invoke.getClass().getDeclaredField("userId");
        userId.setAccessible(true);
        Long aLong = (Long) userId.get(invoke);
        if (FontInterceptor.userHolder.get().equals(aLong)){
            return;
        }
        throw new RuntimeException("没权限");
    }

}
