package com.neu.his.dao;

import com.neu.his.model.Scheduling;
import com.neu.his.model.SchedulingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchedulingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    long countByExample(SchedulingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int deleteByExample(SchedulingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int deleteByPrimaryKey(Integer scheid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int insert(Scheduling record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int insertSelective(Scheduling record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    List<Scheduling> selectByExample(SchedulingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    Scheduling selectByPrimaryKey(Integer scheid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByExampleSelective(@Param("record") Scheduling record, @Param("example") SchedulingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByExample(@Param("record") Scheduling record, @Param("example") SchedulingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByPrimaryKeySelective(Scheduling record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByPrimaryKey(Scheduling record);
}