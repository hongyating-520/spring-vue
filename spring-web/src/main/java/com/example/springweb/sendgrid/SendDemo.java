package com.example.springweb.sendgrid;

import com.alibaba.fastjson.JSON;
import com.sendgrid.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @author ZZQ
 * @Date 2021/7/23 2:38 下午
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        Email from = new Email("support@yoycol.com");
        String subject = "Sending with Twilio SendGrid is Fun";
        Email to = new Email("416432541@qq.com");

        SendGrid sg = new SendGrid("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");
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody("{\"personalizations\":[{\"dynamic_template_data\":{\"link\":\"http://139.129.116.82/sign_up?subAccountCode=0b7f562d41fc9abd4c91ecb825f01a58\",\"invitePerson\":\"ltwvpb39428@chacuo.net\"},\"to\":[{\"email\":\"pkezbf35182@chacuo.net\"}]}],\"from\":{\"email\":\"support@yoycol.com\"},\"template_id\":\"d-cb370425b6154026971d10aed8dec81a\"}");
            Response response = sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        } catch (IOException ex) {
            throw ex;
        }
    }

    public static String buildEmailContent() {
        Map<String, Object> dataMap = new HashMap();
        dataMap.put("from", new Email("support@yoycol.com"));
        dataMap.put("template_id", "sdfsdfsd");
        ArrayList<Map> toList = new ArrayList();
        Map<String, Object> persMap = new HashMap();
        persMap.put("to", new Email("uzmavd14965@chacuo.net"));

        toList.add(persMap);
        dataMap.put("personalizations", toList);

        return JSON.toJSONString(dataMap);
    }



}
