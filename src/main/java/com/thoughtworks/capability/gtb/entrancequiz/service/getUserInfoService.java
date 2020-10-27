package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.dataProvider.studentDataProvider;
import com.thoughtworks.capability.gtb.entrancequiz.model.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class getUserInfoService {

    public List<Member> getStudents() {
        return studentDataProvider.providerMembers();
    }

}
