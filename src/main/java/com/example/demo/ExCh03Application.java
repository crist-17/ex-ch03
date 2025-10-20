package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
    "com.example.demo",  // 기존 프로젝트 패키지
    "com.pci"       // 새로 옮겨온 calculator2 쪽 패키지
    
})
public class ExCh03Application {

    public static void main(String[] args) {
        SpringApplication.run(ExCh03Application.class, args);
    }

}
