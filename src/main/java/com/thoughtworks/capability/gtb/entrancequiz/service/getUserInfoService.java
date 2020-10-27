package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.dataProvider.studentDataProvider;
import com.thoughtworks.capability.gtb.entrancequiz.model.Member;
import com.thoughtworks.capability.gtb.entrancequiz.model.studentGroup;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class getUserInfoService {

    public List<Member> getStudents() {
        return studentDataProvider.providerMembers();
    }

    public List<studentGroup> getGroupedStudent() {
        List<studentGroup> groups = new ArrayList<>(6);

        for (int i=0; i<6; i++){
            groups.add(new studentGroup(i,(i+1) + " 组"));
        }

        Collections.shuffle(groups);

        for (int i=0; i<this.getStudents().size(); i++){
            Member member = this.getStudents().get(i);
            groups.get(i%6).addMember(member);
        }

        return groups.stream().collect(Collectors.toList());
    }
}
