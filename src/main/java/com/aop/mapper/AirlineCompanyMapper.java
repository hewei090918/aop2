package com.aop.mapper;

import com.aop.domain.AirlineCompany;
import com.aop.domain.AirlineCompanyExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AirlineCompanyMapper {
    int countByExample(AirlineCompanyExample example);

    int deleteByExample(AirlineCompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AirlineCompany record);

    int insertSelective(AirlineCompany record);

    List<AirlineCompany> selectByExample(AirlineCompanyExample example);

    AirlineCompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AirlineCompany record, @Param("example") AirlineCompanyExample example);

    int updateByExample(@Param("record") AirlineCompany record, @Param("example") AirlineCompanyExample example);

    int updateByPrimaryKeySelective(AirlineCompany record);

    int updateByPrimaryKey(AirlineCompany record);
}