package com.aop.mapper;

import com.aop.domain.TicketType;
import com.aop.domain.TicketTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketTypeMapper {
    int countByExample(TicketTypeExample example);

    int deleteByExample(TicketTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketType record);

    int insertSelective(TicketType record);

    List<TicketType> selectByExample(TicketTypeExample example);

    TicketType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TicketType record, @Param("example") TicketTypeExample example);

    int updateByExample(@Param("record") TicketType record, @Param("example") TicketTypeExample example);

    int updateByPrimaryKeySelective(TicketType record);

    int updateByPrimaryKey(TicketType record);
}