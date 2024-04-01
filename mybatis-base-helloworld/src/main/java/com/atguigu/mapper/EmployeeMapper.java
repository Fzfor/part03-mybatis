package com.atguigu.mapper;

import com.atguigu.pojo.Employee;

/**
 * @ClassName: EmployeeMapper
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 10:32 2024/03/31
 * @Modified By: bin.zhao
 * @Modify Time: 10:32 2024/03/31
 * @Version: 1.0
 */

public interface EmployeeMapper {

    Employee selectEmpById(Integer id);
}
