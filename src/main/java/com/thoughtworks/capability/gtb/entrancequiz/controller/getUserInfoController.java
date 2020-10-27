package com.thoughtworks.capability.gtb.entrancequiz.controller;



import com.thoughtworks.capability.gtb.entrancequiz.service.getUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin
@RestController
public class getUserInfoController {
    @Autowired
    private final getUserInfoService getUserInfoService;

    public getUserInfoController(getUserInfoService getUserInfoService) {
        this.getUserInfoService = getUserInfoService;
    }

    @GetMapping("/getUser")
    public ArrayList<String> getUser(){
        return getUserInfoService.getStudents();
    }
}
