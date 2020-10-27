package com.thoughtworks.capability.gtb.entrancequiz.controller;



import com.thoughtworks.capability.gtb.entrancequiz.model.studentGroup;
import com.thoughtworks.capability.gtb.entrancequiz.service.getUserInfoService;
import com.thoughtworks.capability.gtb.entrancequiz.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class getUserInfoController {
    @Autowired
    private final getUserInfoService getUserInfoService;

    public getUserInfoController(getUserInfoService getUserInfoService) {
        this.getUserInfoService = getUserInfoService;
    }

    @GetMapping("/getUser")
    public List<Member> getUser(){
        return getUserInfoService.getStudents();
    }

    @GetMapping("/group")
    public List<studentGroup> getGroup(){

        return getUserInfoService.getGroupedStudent();
    }
}
