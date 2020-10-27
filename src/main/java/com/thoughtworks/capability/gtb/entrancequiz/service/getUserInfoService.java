package com.thoughtworks.capability.gtb.entrancequiz.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class getUserInfoService {

    ArrayList<String> student = new ArrayList<>();
    public getUserInfoService() {
        student.add("成吉思汗");
        student.add("鲁班七号");
        student.add("太乙真人");
        student.add("钟无艳");
        student.add("花木兰");
        student.add("雅典娜");
        student.add("芈月");
        student.add("白起");
        student.add("刘禅");
        student.add("庄周");
        student.add("马超");
        student.add("刘备");
        student.add("哪吒");
        student.add("大乔");
        student.add("蔡文姬");
    }

    public ArrayList<String> getStudents() {
        return student;
    }

}
