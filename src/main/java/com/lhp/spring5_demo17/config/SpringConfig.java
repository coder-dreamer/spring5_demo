package com.lhp.spring5_demo17.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * spring配置类
 *
 * @author 53137
 */
@Configuration
//等价于<context:component-scan base-package="com.lhp.spring5_demo17"/>
@ComponentScan(basePackages = "com.lhp.spring5_demo17")
//等价于<aop:aspectj-autoproxy/>
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {

}
