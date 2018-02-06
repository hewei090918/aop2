package com.aop.mapper;

import com.aop.domain.PlaneModel;
import com.aop.domain.PlaneModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlaneModelMapper {
    int countByExample(PlaneModelExample example);

    int deleteByExample(PlaneModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlaneModel record);

    int insertSelective(PlaneModel record);

    List<PlaneModel> selectByExample(PlaneModelExample example);

    PlaneModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlaneModel record, @Param("example") PlaneModelExample example);

    int updateByExample(@Param("record") PlaneModel record, @Param("example") PlaneModelExample example);

    int updateByPrimaryKeySelective(PlaneModel record);

    int updateByPrimaryKey(PlaneModel record);
}