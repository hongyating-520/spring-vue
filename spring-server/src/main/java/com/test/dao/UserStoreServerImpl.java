package com.test.dao;

import com.alibaba.fastjson.JSON;
import com.test.mapper.UserStoreSettingDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * @author ZZQ
 * @Date 2021/6/24 11:20 上午
 */
@Service
public class UserStoreServerImpl implements UserStoreInterface{

    @Resource
    UserStoreSettingDao userStoreSettingDao;

    @Override
    public Boolean insert(UserStoreSetting recod){
        System.out.println(JSON.toJSONString(recod));
        userStoreSettingDao.insert(recod);
        return true;
    }

    @Override
    public List<UserStoreSetting> selectAll(){

        List<UserStoreSetting> userStoreSettings = userStoreSettingDao.selectByExample();

        System.out.println(JSON.toJSONString(userStoreSettings.get(0)));
        return userStoreSettings;
    }

    @Override
    public UserStoreSetting selectByKey(Long key, Long name) {
        System.out.println("------数据库查询获取信息-----key:"+key+"__name:"+name);
        UserStoreSetting storeSetting = new UserStoreSetting();
        storeSetting.setId(key);
        storeSetting.setUserId(999L);
        return storeSetting;
    }
}
