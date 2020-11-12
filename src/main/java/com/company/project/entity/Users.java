package com.company.project.entity;

import java.util.Date;
import javax.persistence.*;

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String password;

    /**
     * 1正常 0冻结
     */
    private Integer status;

    @Column(name = "lastModifyTime")
    private Date lastmodifytime;

    @Column(name = "typeId")
    private Integer typeid;

    private String img;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取1正常 0冻结
     *
     * @return status - 1正常 0冻结
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1正常 0冻结
     *
     * @param status 1正常 0冻结
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return lastModifyTime
     */
    public Date getLastmodifytime() {
        return lastmodifytime;
    }

    /**
     * @param lastmodifytime
     */
    public void setLastmodifytime(Date lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }

    /**
     * @return typeId
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * @param typeid
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }
}