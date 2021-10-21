package com.example.springweb.controller;

import com.alibaba.fastjson.JSON;
import com.example.springweb.aop.OperationAuth;
import com.example.springweb.interceptor.FontInterceptor;
import com.test.dao.UserStoreInterface;
import com.test.dao.UserStoreSetting;
import com.test.server.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/*
 * @author ZZQ
 * @Date 2021/6/24 11:24 上午
 */
@RestController
@RequestMapping()
public class UserController {
    @Autowired
    UserStoreInterface userStoreServer;

    @Autowired
    Map<String, TestInterface> testInterface;

    @RequestMapping("/insert")
    @OperationAuth(service = "userStoreServerImpl",method = "selectByKey",index = 0,args={"id","storeId"})
    public Boolean inser(@RequestBody UserStoreSetting record,String name){
        Long uid = FontInterceptor.userHolder.get();

//        UserStoreSetting storeSetting = userStoreServer.selectByKey(record.getId(), name);
//        if (storeSetting.getUserId().equals(uid)){
//            //后续更新操作
//            return true;
//        }
        //Boolean insert = userStoreServer.insert(record);
        return false;
    }

    @RequestMapping("/select")
    public List<UserStoreSetting> select(){
        List<UserStoreSetting> userStoreSettings = userStoreServer.selectAll();
        return userStoreSettings;
    }

    @GetMapping("/test/{deviceNum}")
    public void test(AuthCallBack callBack,@PathVariable String deviceNum){
        System.out.println(deviceNum);
        System.out.println(JSON.toJSONString(callBack));
    }

   public class AuthCallBack{
        private String code;
        private String name;

       public String getCode() {
           return code;
       }

       public void setCode(String code) {
           this.code = code;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }
   }

}
