package com.skynet.vaccine.mapper;

import com.skynet.vaccine.entity.appointment;
import com.skynet.vaccine.entity.user;
import com.skynet.vaccine.entity.vaccination_record;
import com.skynet.vaccine.entity.vaccine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface usermapper {
    // 用户登录验证
    @Select("select * from user")
    public user checkuserLogin(@Param("username") String username, @Param("password") String password);
    // 添加用户
    int adduser(user user);
    // 修改用户信息
    int updateuser(user user);
    // 根据用户名查询用户信息
    user getuserByusername(String username);
    // 根据用户ID查询用户信息
    user getuserById(Long userId);
    // 查询所有疫苗信息
    List<vaccine> getAllvaccines();
    // 根据疫苗ID查询疫苗信息
    vaccine getvaccineById(Long vaccineId);
    // 用户预约疫苗
    int makeappointment(appointment appointment);
    // 查询用户预约信息
    List<appointment> getappointmentsByuserId(Long userId);
    // 取消用户预约
    int cancelappointment(Long appointmentId);
    // 查询接种记录
    List<vaccination_record> getRecordsByuserId(Long userId);
}
