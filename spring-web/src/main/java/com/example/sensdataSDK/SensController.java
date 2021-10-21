package com.example.sensdataSDK;

import com.sensorsdata.analytics.javasdk.exceptions.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/*
 * @author ZZQ
 * @Date 2021/10/18 6:08 下午
 */
@RestController
@RequestMapping("/sens")
public class SensController {
    @Autowired
    SensDataService sensDataService;

    @RequestMapping("/log")
    public String fileLog() throws InvalidArgumentException {
        String hello = sensDataService.hello(UUID.randomUUID().toString());
        return hello;
    }
}
