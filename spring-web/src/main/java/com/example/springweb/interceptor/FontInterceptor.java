package com.example.springweb.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * @author ZZQ
 * @Date 2021/6/21 1:42 下午
 */
public class FontInterceptor implements HandlerInterceptor {

    public static final ThreadLocal<Long> userHolder = new ThreadLocal();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        userHolder.set(666L);
        System.out.println("======进入拦截器前置方法=====thread:"+Thread.currentThread().getName()+"_userId:"+userHolder.get());
        System.out.println(request.getRequestURI());
        String authorization = request.getHeader("authorization");
        //hander格式:Bearer quanxiancanshupeizhishezhi
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        userHolder.remove();
    }


}
