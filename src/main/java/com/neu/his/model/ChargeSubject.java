package com.neu.his.model;

public class ChargeSubject {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charge_subject.chargeSubjectID
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    private Byte chargesubjectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charge_subject.chargeSubjectName
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    private String chargesubjectname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charge_subject.chargeSubjectCode
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    private String chargesubjectcode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charge_subject.chargeSubjectID
     *
     * @return the value of charge_subject.chargeSubjectID
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public Byte getChargesubjectid() {
        return chargesubjectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charge_subject.chargeSubjectID
     *
     * @param chargesubjectid the value for charge_subject.chargeSubjectID
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setChargesubjectid(Byte chargesubjectid) {
        this.chargesubjectid = chargesubjectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charge_subject.chargeSubjectName
     *
     * @return the value of charge_subject.chargeSubjectName
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public String getChargesubjectname() {
        return chargesubjectname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charge_subject.chargeSubjectName
     *
     * @param chargesubjectname the value for charge_subject.chargeSubjectName
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setChargesubjectname(String chargesubjectname) {
        this.chargesubjectname = chargesubjectname == null ? null : chargesubjectname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charge_subject.chargeSubjectCode
     *
     * @return the value of charge_subject.chargeSubjectCode
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public String getChargesubjectcode() {
        return chargesubjectcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charge_subject.chargeSubjectCode
     *
     * @param chargesubjectcode the value for charge_subject.chargeSubjectCode
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setChargesubjectcode(String chargesubjectcode) {
        this.chargesubjectcode = chargesubjectcode == null ? null : chargesubjectcode.trim();
    }
}