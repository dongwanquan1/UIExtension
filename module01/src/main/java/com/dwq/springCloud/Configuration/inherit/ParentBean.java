package com.dwq.springCloud.Configuration.inherit;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


/**
 * @Author dwq
 * @Create 2021/5/8
 **/
@Data
@Configuration("parentConfig")
@ConfigurationProperties(prefix = "config.test.parent")
public class ParentBean {
    private String host;
    private int port;
    private int minHeartBeat;
}
