package com.atguigu.pojo;

public class Employee {

    private Integer empId;

    private String empName;

    private Double empSalary;
    
    //getter | setter


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}