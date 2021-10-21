package com.example.springweb;


import com.alibaba.fastjson.JSON;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Timer;
import io.micrometer.prometheus.PrometheusConfig;
import io.micrometer.prometheus.PrometheusMeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author:zzq
 * @Date:2021/5/30-05-30
 */

@RestController
@RequestMapping("/api/vue")
public class TestController {

    @Autowired
    io.micrometer.core.instrument.MeterRegistry meterRegistry;

    @RequestMapping(value = "/link")
    public BarInfo linkTest(@RequestBody UserInfo userInfo,String getP){
        System.out.println("----------vue---------"+JSON.toJSONString(userInfo)+"___"+getP);
       int a = new Random().nextInt(100);
        int b = new Random().nextInt(100);
        int c = new Random().nextInt(100);
        int[] ints = {a, b, c};
        BarInfo barInfo = new BarInfo(ints);
        System.out.println(JSON.toJSONString(barInfo));
        int i = new Random().nextInt(3);
        int account = new Random().nextInt(1000);
        String city = "chine";
        switch (i){
            case 1:city="usa";break;
            case 2:city="canada";break;
            case 3:city="hk";break;
        }
        Counter counter = meterRegistry.counter("yoycol_order_info", "city", city);
        counter.increment(account);
        System.out.println(counter.measure());
        Integer gauge = meterRegistry.gauge("yoycol_order_info_account", account);
        System.out.println("订单总金额"+gauge);
        return barInfo;
    }

    @RequestMapping("/ha")
    public ModelAndView get(@RequestBody UserInfo userInfo) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(userInfo.getUsername() + "||" + userInfo.getPassword());
        ModelAndView view = new ModelAndView();
        view.addObject("result", "sucess");
        return view;
    }

    public void timer2(){
        Timer timer = meterRegistry.timer("timer_test_demo", "timer", "timersample");
        for(int i=0; i<3; i++) {
            timer.record(() -> {
                createOrder();
            });
        }
        System.out.println(timer.count());
        System.out.println(timer.measure());
        System.out.println(timer.totalTime(TimeUnit.SECONDS));
        System.out.println(timer.mean(TimeUnit.SECONDS));
        System.out.println(timer.max(TimeUnit.SECONDS));
    }
    private static void createOrder() {
        try {
            TimeUnit.SECONDS.sleep(1); //模拟方法耗时
        } catch (InterruptedException e) {
            //no-operation
        }
    }
}
class BarInfo{
    private String type = "bar";
    private int[] data;

    public BarInfo(int[] datas) {
        this.data = datas;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }
}
