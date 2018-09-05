package cn.edu.zua.demo.entity.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * UserInfoDO
 * 用户信息业务实体
 *
 * @author ascend
 * @date 2018/9/5 11:03.
 */
public class UserInfoDO implements Serializable {

    private static final long serialVersionUID = 2740544421155496415L;
    /**
     * 主键，自增
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 加密后的密码
     */
    private String password;

    /**
     * 用户角色，系统管理员，普通管理员
     */
    private String roleName;

    public UserInfoDO() {
        // 空构造
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
