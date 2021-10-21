package com.example.springweb.interceptor;

import com.example.springweb.UserInfo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.actuate.autoconfigure.endpoint.web.CorsEndpointProperties;
import org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties;
import org.springframework.boot.actuate.autoconfigure.endpoint.web.servlet.WebMvcEndpointManagementContextConfiguration;
import org.springframework.boot.actuate.endpoint.web.*;
import org.springframework.boot.actuate.endpoint.web.annotation.ControllerEndpointsSupplier;
import org.springframework.boot.actuate.endpoint.web.annotation.ServletEndpointsSupplier;
import org.springframework.boot.actuate.endpoint.web.servlet.WebMvcEndpointHandlerMapping;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.AbstractHandlerMapping;
import org.springframework.web.servlet.handler.AbstractHandlerMethodMapping;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * @author ZZQ
 * @Date 2021/10/20 5:56 下午
 */
@Component
public class MyWebMvcEndpointHandlerMapping  implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof WebMvcEndpointHandlerMapping){
            WebMvcEndpointHandlerMapping mapping = (WebMvcEndpointHandlerMapping) bean;
            mapping.setInterceptors(new FontInterceptor());
            Class<? extends WebMvcEndpointHandlerMapping> aClass = mapping.getClass();
            Class ab = null;
            Class<?> superclass3 = aClass.getSuperclass();
            Class p = getP(superclass3);
            Field[] fields = p.getDeclaredFields();
            for (Field field : fields) {
                if (field.getName().equals("adaptedInterceptors")){
                    field.setAccessible(true);
                    try {
                        Object obj = field.get(mapping);
                        if (obj instanceof ArrayList){
                            List<HandlerInterceptor> list = (List<HandlerInterceptor>) obj;
                            list.add(new FontInterceptor());
                            field.set(mapping,list);
                            break;
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return bean;
    }
    protected Class getP(Class c){
        Class p = c.getSuperclass();
        if (p == null){
            return c;
        }
        if (!AbstractHandlerMapping.class.equals(p)){
            return getP(p);
        }
        return p;
    }
}
