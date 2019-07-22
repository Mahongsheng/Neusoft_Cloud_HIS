package com.neu.his.dao;

import com.neu.his.model.Patient;
import com.neu.his.model.PatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    long countByExample(PatientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int deleteByExample(PatientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int deleteByPrimaryKey(Integer patientrecordid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int insert(Patient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int insertSelective(Patient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    List<Patient> selectByExample(PatientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    Patient selectByPrimaryKey(Integer patientrecordid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByExampleSelective(@Param("record") Patient record, @Param("example") PatientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByExample(@Param("record") Patient record, @Param("example") PatientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByPrimaryKeySelective(Patient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByPrimaryKey(Patient record);
}