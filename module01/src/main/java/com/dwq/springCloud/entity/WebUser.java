package com.dwq.springCloud.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author dwq
 * @Create 2021/5/8
 **/

public class WebUser extends User{

    public void setName(String name) {
        super.setName("Web user::"+name);
    }

}
