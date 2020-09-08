package com.lg.community;

import com.lg.community.dao.UserMapper;
import com.lg.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class UserMapperTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    UserMapper userMapper;
    @Test
    public void test() throws SQLException {
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void testSelect(){
        User user = userMapper.selectById(1);
        System.out.println(user);
        User user1 = userMapper.selectByEmail("nowcoder1@sina.com");
        System.out.println(user1);
        User user2 = userMapper.selectByName("SYSTEM");
        System.out.println(user2);
    }
    @Test
    public void testInsertUser(){
        User user = new User();
        user.setUsername("cengxunuo");
        user.setPassword("990322");
        user.setEmail("cengxunuo88@gmail.com");
        user.setHeaderUrl("http://www.newcoder.com/101.png");
        user.setCreateTime(new Date());
        userMapper.insertUser(user);
    }
    @Test
    public void testUpdate(){
        int status = userMapper.updateStatus(150, 1);
        System.out.println(status);
        int password = userMapper.updatePassword(150, "199903");
        System.out.println(password);
        int header = userMapper.updateHeader(150, "http://www.newcoder.com/102.png");
        System.out.println(header);
        
    }
}
