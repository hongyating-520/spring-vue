package com.test.server.impl;

import com.test.server.TestInterface;
import org.springframework.stereotype.Service;

/*
 * @author ZZQ
 * @Date 2021/7/12 9:47 上午
 */
@Service("atestServer")
public class AtestServer implements TestInterface {
    @Override
    public void say() {
        System.out.println("AAAA");
    }
}
