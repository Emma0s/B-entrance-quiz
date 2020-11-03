// TODO GTB-工程实践: - 包名应小写
package com.thoughtworks.capability.gtb.entrancequiz.dataProvider;

import com.thoughtworks.capability.gtb.entrancequiz.model.Member;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class studentDataProvider {
    public static List<Member> providerMembers(){
        List<Member> memberArrayList = Arrays.asList(
                new Member(1,"成吉思汗"),
                new Member(2,"鲁班七号"),
                new Member(3,"太乙真人"),
                new Member(4,"钟无艳"),
                new Member(5,"花木兰"),
                new Member(6,"雅典娜"),
                new Member(7,"芈月"),
                new Member(8,"白起"),
                new Member(9,"刘禅"),
                new Member(10,"庄周"),
                new Member(11,"马超"),
                new Member(12,"刘备"),
                new Member(13,"哪吒"),
                new Member(14,"大桥"),
                new Member(15,"蔡文姬")
        );
        // TODO GTB-知识点: + 使用了stream
        return memberArrayList.stream().sorted(Comparator.comparing(Member::getId)).collect(Collectors.toList());
    }
}
