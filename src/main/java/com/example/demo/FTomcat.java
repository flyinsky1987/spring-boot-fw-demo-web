package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author fuwei
 * 要将项目打包为war，并且部署到tomcat，需要如下几步
 * 1、pom.xml修改打包方式为war
 * 2、创建这个类，sources引用为application类
 * 3、application.properties配置文件中增加server.context-path=/项目名称/
 * 
 * 4、执行 mvn package
 */
public class FTomcat  extends SpringBootServletInitializer {  

    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
        return application.sources(SpringFwDemoWebApplication.class);  
    }  

}  