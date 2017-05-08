package com.yuwhuawang.mapper;

import com.yuwhuawang.domain.UserVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by yuwhuawang on 2017/5/8.
 */

@Mapper
public interface UserMapper {
    UserVo getUserById(long id);

}
