package com.mapper;

import com.model.Buzhi;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuzhiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_buzhi
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer buzhiId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_buzhi
     *
     * @mbggenerated
     */
    int insert(Buzhi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_buzhi
     *
     * @mbggenerated
     */
    Buzhi selectByPrimaryKey(Integer buzhiId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_buzhi
     *
     * @mbggenerated
     */
    List<Buzhi> selectAll(@Param("buzhi")Buzhi record,@Param("page")int page,@Param("rows")int rows);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_buzhi
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Buzhi record);
}