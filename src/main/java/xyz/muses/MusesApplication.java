package xyz.muses;

/**
 * Copyright 2022 All rights reserved.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

import xyz.muses.config.annotation.EnableDubboProvider;

/**
 * @author jervis
 * @date 2022/11/14.
 */
@SpringBootApplication
// @EnableScheduling
// @EnableDubboProvider
@EnableAspectJAutoProxy(exposeProxy = true)
public class MusesApplication {

    /**
     * 启动
     *
     * @param args
     */
    public static void main(String[] args) {
        loadConfiguration();
        SpringApplication.run(MusesApplication.class, args);
    }

    /**
     * 加载配置
     */
    private static void loadConfiguration() {
        System.setProperty("test", "test");
    }
}
