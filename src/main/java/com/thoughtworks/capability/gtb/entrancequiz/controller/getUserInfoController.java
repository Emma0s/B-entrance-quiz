package com.thoughtworks.capability.gtb.entrancequiz.controller;



import com.thoughtworks.capability.gtb.entrancequiz.model.studentGroup;
import com.thoughtworks.capability.gtb.entrancequiz.service.getUserInfoService;
import com.thoughtworks.capability.gtb.entrancequiz.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// TODO GTB-知识点: - @CrossOrigin应指定特定域名，避免使用通配
@CrossOrigin(origins = "*")
@RestController
// TODO GTB-工程实践: - 类名应使用驼峰，且首字母大写，尽量只包含名词
public class getUserInfoController {
    // TODO GTB-工程实践: - @Autowired注解可以省略
    @Autowired
    private final getUserInfoService getUserInfoService;

    public getUserInfoController(getUserInfoService getUserInfoService) {
        this.getUserInfoService = getUserInfoService;
    }

    // TODO GTB-知识点: - URL应遵循Restful API Design
    @GetMapping("/getUser")
    public List<Member> getUser(){
        return getUserInfoService.getStudents();
    }

    @GetMapping("/group")
    public List<studentGroup> getGroup(){

        return getUserInfoService.getGroupedStudent();
    }
}
