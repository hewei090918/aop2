package com.aop.mapper;

import com.aop.domain.FlightSchedular;
import com.aop.domain.FlightSchedularExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FlightSchedularMapper {
    int countByExample(FlightSchedularExample example);

    int deleteByExample(FlightSchedularExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FlightSchedular record);

    int insertSelective(FlightSchedular record);

    List<FlightSchedular> selectByExample(FlightSchedularExample example);

    FlightSchedular selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FlightSchedular record, @Param("example") FlightSchedularExample example);

    int updateByExample(@Param("record") FlightSchedular record, @Param("example") FlightSchedularExample example);

    int updateByPrimaryKeySelective(FlightSchedular record);

    int updateByPrimaryKey(FlightSchedular record);
}