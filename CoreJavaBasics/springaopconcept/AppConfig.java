package com.thirdware.springaopconcept;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="com.thirdware.springaopconcept")
@EnableAspectJAutoProxy
public class AppConfig {

}
