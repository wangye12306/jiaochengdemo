package cn.wykjc.jiaochengdemo.user.entity;

import java.util.Date;

/**
 * @author wystart
 * @create 2021-03-14-11:02
 */
public class UserEntity {
    private  int id;
    private String username;
    private String password;
    private Date createtime;
    private int status;

    public UserEntity() {
    }

    public UserEntity(int id, String username, String password, Date createtime, int status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createtime = createtime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassworld(String passworld) {
        this.password = password;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passworld='" + password + '\'' +
                ", createtime=" + createtime +
                ", status=" + status +
                '}';
    }
}
