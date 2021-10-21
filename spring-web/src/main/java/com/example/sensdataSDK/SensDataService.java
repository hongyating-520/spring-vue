package com.example.sensdataSDK;

import com.sensorsdata.analytics.javasdk.ISensorsAnalytics;
import com.sensorsdata.analytics.javasdk.bean.EventRecord;
import com.sensorsdata.analytics.javasdk.exceptions.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.UUID;

/*
 * @author ZZQ
 * @Date 2021/10/18 6:07 下午
 */
@Service
public class SensDataService {
    //注入神策实例化对象
    @Autowired
    ISensorsAnalytics sa;
    public String hello(String userId) throws InvalidArgumentException {
        //相关业务处理逻辑代码
        System.out.println("------业务处理");
        //调用神策 SDK 记录事件
        EventRecord eventRecord = EventRecord.builder().setDistinctId(userId).isLoginId(Boolean.TRUE)
                .setEventName("track")
                .addProperty("$time", Calendar.getInstance().getTime())
                .addProperty("$date", UUID.randomUUID().toString())
                .build();
        return "success";
    }
}
