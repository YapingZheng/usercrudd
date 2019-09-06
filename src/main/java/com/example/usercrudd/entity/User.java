package com.example.usercrudd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userTable")
public class User {
    @Id
//----自增-----
    @GeneratedValue
    private Integer id;
    private String name;
    private String sex;

    public User(){}
    public User(String name,String sex){
//        this.id=id;
        this.name=name;
        this.sex=sex;
}

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

}
