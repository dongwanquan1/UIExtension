package com.dwq.springCloud;

import com.dwq.springCloud.Configuration.inherit.ChildBean;
import com.dwq.springCloud.Configuration.inherit.ParentBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
        ParentBean parentBean =context.getBean("parentConfig",ParentBean.class);
        ChildBean childBean =context.getBean("childConfig",ChildBean.class);

        System.out.println("parentBean is "+parentBean);
        System.out.println("childBean is "+childBean);
    }
}