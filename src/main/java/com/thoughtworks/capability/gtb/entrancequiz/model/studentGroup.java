package com.thoughtworks.capability.gtb.entrancequiz.model;

import java.util.ArrayList;
import java.util.List;

public class studentGroup {
    private int id;
    private String name;
    private List<Member> memberList;

    public studentGroup(int id, String name) {
        this.id = id;
        this.name = name;
        this.memberList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public void addMember(Member member){
        this.memberList.add(member);
    }
}
