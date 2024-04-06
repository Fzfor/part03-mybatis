package com.atguigu.mapper;

import com.atguigu.pojo.User;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 10:33 2024/04/03
 * @Modified By: bin.zhao
 * @Modify Time: 10:33 2024/04/03
 * @Version: 1.0
 */

public interface UserMapper {
    int insertUser(User user);

    User selectUserById(int id);

    int updateUser(User user);

    int deleteUser(int id);

    List<User> selectAll();
}
