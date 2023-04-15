package com.skynet.vaccine.mapper;

import com.skynet.vaccine.entity.appointment;
import com.skynet.vaccine.entity.hospital_staff;
import com.skynet.vaccine.entity.vaccine;
import com.skynet.vaccine.entity.vaccine_inventory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface hospital_staff_mapper {
    // 医疗机构工作人员登录验证
    hospital_staff checkhospital_staffLogin(@Param("username") String username, @Param("password") String password);
    // 查询医疗机构预约信息
    List<appointment> getReservationsByOrgId(Long orgId);
    // 撤销医疗机构预约
    int cancelReservation(Long reservationId);
    // 查询疫苗库存信息
    List<vaccine> getVaccineStocksByOrgId(Long orgId);
    // 医疗机构确认接种疫苗
    int confirmVaccine(Long reservationId);
    // 查询接种记录
    List<vaccine_inventory> getRecordsByhospital_staffId(Long hospital_staffId);
    // 新增疫苗信息
    int addVaccine(vaccine vaccine);
}
