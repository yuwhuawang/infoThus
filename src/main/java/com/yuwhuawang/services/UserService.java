package com.yuwhuawang.services;

import com.yuwhuawang.domain.UserVo;
import com.yuwhuawang.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yuwhuawang on 2017/5/8.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserVo getUserById(long id) {
        return userMapper.getUserById(id);
    }
}
