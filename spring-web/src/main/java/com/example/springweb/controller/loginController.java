package com.example.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/*
 * @author ZZQ
 * @Date 2021/7/23 5:25 下午
 */
@Controller
@RequestMapping
public class loginController extends WebMvcConfigurerAdapter implements HandlerInterceptor {

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {


    }

    @RequestMapping("/login2")
    public String login2(ModelMap map){
        map.addAttribute("host","jahajsdfds");
        return "login";
    }

    @RequestMapping("/login3")
    @ResponseBody
    public void login(ModelAndView modelAndView,HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.sendRedirect("/login2");
        return ;
    }



    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
