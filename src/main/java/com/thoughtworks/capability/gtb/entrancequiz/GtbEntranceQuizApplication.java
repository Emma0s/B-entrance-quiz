package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@SpringBootApplication
public class GtbEntranceQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtbEntranceQuizApplication.class, args);
	}

	// TODO GTB-工程实践: - demo用的代码应及时清理
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}

}
// TODO GTB-综合: * 整体完成度低，部分维度无法给出准确评价
// TODO GTB-完成度: * 实现了查询学生列表和分组的功能，但是有bug
// TODO GTB-测试: * 没有包含任何测试
// TODO GTB-知识点: * 没有掌握Spring MVC相关的知识点
// TODO GTB-知识点: * 没有掌握Spring IoC相关的知识点
// TODO GTB-知识点: * 没有掌握Restful API Design相关的知识点
// TODO GTB-工程实践: * clean code还有很大提升空间，没有理解分层架构
