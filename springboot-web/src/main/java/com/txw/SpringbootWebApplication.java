package com.txw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 项目启动类
 * 保证其他的类需要在该类的平级或者下级目录，才可以被扫描到
 * create by txw on 2018-06-25
 */
@SpringBootApplication
public class SpringbootWebApplication {

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class, args);
    }
}
