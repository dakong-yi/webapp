package usertest;

import admin.mapper.UserMapper;
import admin.mapper.UserQueryMapper;
import admin.model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    private ApplicationContext applicationContext;

    @Before
    public void setup() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:conf/spring-mybatis.xml");
    }

    @Test
    public void testGetUser() throws Exception {
//        UserQueryMapper userQueryMapper = (UserQueryMapper) applicationContext.getBean("userQueryMapper");
//        User user =  userQueryMapper.getUser(1);
//        System.out.println(user.getName() + ":" + user.getId());

        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapperImpl");
        User user1 = userMapper.getUser(1);
        System.out.println(user1.getName()+":"+user1.getId());
    }
}
