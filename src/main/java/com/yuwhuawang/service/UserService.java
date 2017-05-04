package com.yuwhuawang.service;

import com.yuwhuawang.domain.UserVo;
import com.yuwhuawang.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuwhuawang on 17/5/4.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<UserVo> getByNickName(String nickname) {
        return userMapper.getByNickName(nickname);
    }
}
