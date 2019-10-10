package com.example.common.model;

import java.io.Serializable;

/**
 * @description:
 * @author: chuan
 * @create: 2019-10-09 15:23
 * @note
 **/
public class People implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1415852192397895853L;
    // 人员编号
    private int id;
    // 姓名
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People [id=" + id + ", name=" + name + "]";
    }

}
