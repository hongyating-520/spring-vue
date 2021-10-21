package com.test.dao;

import java.util.List;

/*
 * @author ZZQ
 * @Date 2021/6/24 11:29 上午
 */
public interface UserStoreInterface {

    public Boolean insert(UserStoreSetting recod);

    public List<UserStoreSetting> selectAll();

    public UserStoreSetting selectByKey(Long key,Long name);

}
