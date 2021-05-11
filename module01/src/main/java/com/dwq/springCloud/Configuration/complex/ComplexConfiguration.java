package com.dwq.springCloud.Configuration.complex;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @Author dwq
 * @Create 2021/5/11
 **/
@Data
@Configuration
@ConfigurationProperties(prefix = "complex.config")

public class ComplexConfiguration {
    private String appName;
    private List<templateConfiguration> templates;
}
