package com.pinyougou.pojo;

import java.io.Serializable;

/**
 * @ClassName TbBrand
 * @Author 123456
 * @Description TODO
 * @Version 1.0
 * @Date 2018/11/23 17:16
 **/

public class TbBrand implements Serializable {

    private Long id;
    private String name;
    private String firstChar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }
}
