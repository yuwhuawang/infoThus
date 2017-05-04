package com.yuwhuawang;

import com.yuwhuawang.domain.UserVo;
import com.yuwhuawang.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class VsiteApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Test
	@Rollback
	public void findByName() throws Exception {
		UserVo user = new UserVo();
		user.setEmail("lala");
		user.setPassword("haha");
		user.setNickname("AAA");
		userMapper.insertUser(user);
		UserVo u = userMapper.getByNickName("AAA").get(0);
		Assert.assertEquals("lala", u.getEmail());
	}

}
