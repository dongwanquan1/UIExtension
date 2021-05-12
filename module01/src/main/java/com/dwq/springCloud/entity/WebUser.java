package com.dwq.springCloud.entity;

/**
 * @Author dwq
 * @Create 2021/5/8
 **/

public class WebUser extends User{
    @Override
    public void setName(String name) {
        super.setName("Web user::"+name);
    }

}
