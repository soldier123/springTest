package net.spring.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: Administrator
 * Date: 13-12-2
 * Time: 下午2:03
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    public Integer id;

    @Column
    public String uname;

    @Column
    public String upw;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpw() {
        return upw;
    }

    public void setUpw(String upw) {
        this.upw = upw;
    }
}
