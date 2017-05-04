package com.yuwhuawang.mapper;

import com.yuwhuawang.domain.UserVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yuwhuawang on 17/5/4.
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE NICKNAME = #{nickname}")
    List<UserVo> getByNickName(@Param("nickname") String nickName);

    @Insert("INSERT INTO user (email, password, nickname) values (#{email}, #{password}, #{nickname})")
    int insertUser(UserVo user);
}
