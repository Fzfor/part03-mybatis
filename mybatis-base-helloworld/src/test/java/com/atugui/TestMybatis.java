package com.atugui;

import com.atguigu.mapper.EmployeeMapper;
import com.atguigu.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName: TestMybatis
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 10:37 2024/03/31
 * @Modified By: bin.zhao
 * @Modify Time: 10:37 2024/03/31
 * @Version: 1.0
 */

public class TestMybatis {

    @Test
    public void testMybatis() throws IOException {
        String mybatisConfPath = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(mybatisConfPath);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();

        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

        Employee employee = mapper.selectEmpById(2);

        System.out.println("employee = " + employee);


        session.commit();
        session.close();
    }
}
