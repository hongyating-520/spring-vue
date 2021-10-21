package com.example.springweb.interceptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.actuate.endpoint.web.servlet.WebMvcEndpointHandlerMapping;

/*
 * @author ZZQ
 * @Date 2021/10/20 7:03 下午
 */
public class BPP implements BeanPostProcessor  {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("bean____"+beanName);
//        try {
//            if (bean instanceof WebMvcEndpointHandlerMapping){
//                WebMvcEndpointHandlerMapping mapping = (WebMvcEndpointHandlerMapping) bean;
//                System.out.println("+++++++++");
//                mapping.setInterceptors(new FontInterceptor());
//                Class<?> aClass = ClassLoader.getSystemClassLoader().loadClass("org.springframework.context.support.ApplicationContextAwareProcessor");
//                Object o = aClass.newInstance();
//                System.out.println(o);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        return bean;
    }
}
