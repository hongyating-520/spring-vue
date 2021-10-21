package com.test.mapper;

import com.test.dao.UserStoreSetting;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserStoreSettingDao {


    int insert(UserStoreSetting record);

    List<UserStoreSetting> selectByExample();


}
