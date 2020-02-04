package com.study.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
        System.out.println("--------------加载完成----------------");
        System.out.println("--------------你看到了吗？----------------");
        System.out.println("--------------你又看到了吗？----------------");
        System.out.println("--------------你真的不能看到了吗？----------------");
        System.out.println("可以看见了");
        System.out.println("真的看不见嘛");
        System.out.println("看到了就好");
        System.out.println("不应该被覆盖");
    }

}
