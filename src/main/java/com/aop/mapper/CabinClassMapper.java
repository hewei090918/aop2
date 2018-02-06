package com.aop.mapper;

import com.aop.domain.CabinClass;
import com.aop.domain.CabinClassExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CabinClassMapper {
    int countByExample(CabinClassExample example);

    int deleteByExample(CabinClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CabinClass record);

    int insertSelective(CabinClass record);

    List<CabinClass> selectByExample(CabinClassExample example);

    CabinClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CabinClass record, @Param("example") CabinClassExample example);

    int updateByExample(@Param("record") CabinClass record, @Param("example") CabinClassExample example);

    int updateByPrimaryKeySelective(CabinClass record);

    int updateByPrimaryKey(CabinClass record);
}