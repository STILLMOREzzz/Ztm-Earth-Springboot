package com.earth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.earth.mapper")
@SpringBootApplication
public class EarthMeshApplication {
    public static void main(String[] args) {
        SpringApplication.run(EarthMeshApplication.class, args);
    }

}
