package com.neu.his.model;

import java.util.Date;

public class Settlement {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.settlementID
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    private Integer settlementid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.userID
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    private Short userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.settlementStartTime
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    private Date settlementstarttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.settlementEndTime
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    private Date settlementendtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.settlementID
     *
     * @return the value of settlement.settlementID
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public Integer getSettlementid() {
        return settlementid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.settlementID
     *
     * @param settlementid the value for settlement.settlementID
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setSettlementid(Integer settlementid) {
        this.settlementid = settlementid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.userID
     *
     * @return the value of settlement.userID
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public Short getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.userID
     *
     * @param userid the value for settlement.userID
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setUserid(Short userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.settlementStartTime
     *
     * @return the value of settlement.settlementStartTime
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public Date getSettlementstarttime() {
        return settlementstarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.settlementStartTime
     *
     * @param settlementstarttime the value for settlement.settlementStartTime
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setSettlementstarttime(Date settlementstarttime) {
        this.settlementstarttime = settlementstarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.settlementEndTime
     *
     * @return the value of settlement.settlementEndTime
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public Date getSettlementendtime() {
        return settlementendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.settlementEndTime
     *
     * @param settlementendtime the value for settlement.settlementEndTime
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setSettlementendtime(Date settlementendtime) {
        this.settlementendtime = settlementendtime;
    }
}