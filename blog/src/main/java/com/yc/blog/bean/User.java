package com.yc.blog.bean;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sn
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    private String sn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.cn_name
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    private String cnName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.type
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.hint_pwd
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    private String hintPwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.address
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.class_id
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    private Integer classId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.status
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.permis
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    private String permis;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.head
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    private String head;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_time
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sn
     *
     * @return the value of user.sn
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public String getSn() {
        return sn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sn
     *
     * @param sn the value for user.sn
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.cn_name
     *
     * @return the value of user.cn_name
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public String getCnName() {
        return cnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.cn_name
     *
     * @param cnName the value for user.cn_name
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public void setCnName(String cnName) {
        this.cnName = cnName == null ? null : cnName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.type
     *
     * @return the value of user.type
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.type
     *
     * @param type the value for user.type
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.hint_pwd
     *
     * @return the value of user.hint_pwd
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public String getHintPwd() {
        return hintPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.hint_pwd
     *
     * @param hintPwd the value for user.hint_pwd
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public void setHintPwd(String hintPwd) {
        this.hintPwd = hintPwd == null ? null : hintPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.address
     *
     * @return the value of user.address
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.address
     *
     * @param address the value for user.address
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.class_id
     *
     * @return the value of user.class_id
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.class_id
     *
     * @param classId the value for user.class_id
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.status
     *
     * @return the value of user.status
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.status
     *
     * @param status the value for user.status
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.permis
     *
     * @return the value of user.permis
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public String getPermis() {
        return permis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.permis
     *
     * @param permis the value for user.permis
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public void setPermis(String permis) {
        this.permis = permis == null ? null : permis.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.head
     *
     * @return the value of user.head
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public String getHead() {
        return head;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.head
     *
     * @param head the value for user.head
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_time
     *
     * @return the value of user.create_time
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_time
     *
     * @param createTime the value for user.create_time
     *
     * @mbg.generated Wed Aug 14 20:02:09 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}