package com.zhangyx;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:application-bean.xml"})
public class LoadConfig {
}
