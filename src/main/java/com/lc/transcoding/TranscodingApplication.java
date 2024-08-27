package com.lc.transcoding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@MapperScan("com.jingnuo.transcoding.mapper")
public class TranscodingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TranscodingApplication.class, args);
    }

}
