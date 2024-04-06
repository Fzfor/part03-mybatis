package com.atguigu;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName: Test
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 10:48 2024/04/03
 * @Modified By: bin.zhao
 * @Modify Time: 10:48 2024/04/03
 * @Version: 1.0
 */

public class Test {

    private UserMapper userMapper;

    @BeforeEach
    public void before() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @org.junit.jupiter.api.Test
    public void test() {
        User user = new User();
        user.setUsername("james");
        user.setPassword("111");
        int i = userMapper.insertUser(user);
        System.out.println("i = " + i);

        user.setUsername("张三");
        userMapper.insertUser(user);

        int i1 = userMapper.deleteUser(2);
        System.out.println("i1 = " + i1);

        user.setId(1);
        user.setUsername("古天乐2");
        user.setPassword("123312");
        int i2 = userMapper.updateUser(user);
        System.out.println("i2 = " + i2);


        User user1 = userMapper.selectUserById(1);
        System.out.println("user1 = " + user1);

        userMapper.selectAll().forEach(System.out::println);
    }
}
