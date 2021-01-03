package org.springframework.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;

// 使用 @SpringBootApplication 注解，标明是 Spring Boot 应用。通过它，可以开启自动配置的功能。
@SpringBootApplication
public class MVCApplication {

	public static void main(String[] args) {
		/**
		 * 调用 {@link SpringApplication#run(String...)} 启动 Spring Boot 应用
		 */
		SpringApplication.run(MVCApplication.class, args);
	}

}
