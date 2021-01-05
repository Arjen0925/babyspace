package com.jyinit.babyspace.common.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author AJ ajin0369@outlook.com
 */
public class BaseDO implements Serializable {

    private static final long serialVersionUID = 6140619445375817208L;

    private Long id;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String createUser;

    private String updateUser;

    private Boolean isDelete;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseDO baseDO = (BaseDO) o;
        return Objects.equals(id, baseDO.id) &&
                Objects.equals(createTime, baseDO.createTime) &&
                Objects.equals(updateTime, baseDO.updateTime) &&
                Objects.equals(createUser, baseDO.createUser) &&
                Objects.equals(updateUser, baseDO.updateUser) &&
                Objects.equals(isDelete, baseDO.isDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createTime, updateTime, createUser, updateUser, isDelete);
    }

    @Override
    public String toString() {
        return "BaseDO{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createUser='" + createUser + '\'' +
                ", updateUser='" + updateUser + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }


}
