package com.dwq.springCloud.Configuration.inherit;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author dwq
 * @Create 2021/5/8
 **/
@Data
@Configuration("childConfig")
@ConfigurationProperties(prefix = "config.test.child")
public class ChildBean extends ParentBean{

    @Override
    public String toString() {
        return "ParentBean{" +
                "host='" + this.getHost() + '\'' +
                ", port=" + this.getPort() +
                ", minHeartBeat=" + this.getMinHeartBeat() +
                '}';
    }

}
