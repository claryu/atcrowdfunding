package com.atguigu.crowd.entity;

import java.util.List;
import java.util.Map;

/**
 *
 * @Author: xy187 2020年12月10日 下午11:35:50
 *
 * @Desc:
 */
public class Student {
    private Integer sid;
    private String name;
    private Integer age;
    private String sex;
    private Address address;
    private Map<String, String> score;
    private List<String> hobby;

    public Student(Integer sid, String name, Integer age, String sex, Address address, Map<String, String> score,
            List<String> hobby) {
        super();
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.score = score;
        this.hobby = hobby;
    }

    public Student() {
    };

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<String, String> getScore() {
        return score;
    }

    public void setScore(Map<String, String> score) {
        this.score = score;
    }

    public List<String> getClasses() {
        return hobby;
    }

    public void setClasses(List<String> hobby) {
        this.hobby = hobby;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", sex=" + sex + ", address=" + address
                + ", score=" + score + ", hobby=" + hobby + "]";
    }

}
