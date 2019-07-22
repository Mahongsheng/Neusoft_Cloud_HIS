package com.neu.his.dao;

import com.neu.his.model.Invoice;
import com.neu.his.model.InvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    long countByExample(InvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int deleteByExample(InvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int deleteByPrimaryKey(Integer invoiceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int insert(Invoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int insertSelective(Invoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    List<Invoice> selectByExample(InvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    Invoice selectByPrimaryKey(Integer invoiceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByExampleSelective(@Param("record") Invoice record, @Param("example") InvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByExample(@Param("record") Invoice record, @Param("example") InvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByPrimaryKeySelective(Invoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByPrimaryKey(Invoice record);
}