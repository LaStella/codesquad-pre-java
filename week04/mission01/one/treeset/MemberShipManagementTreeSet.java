package week04.mission01.one.treeset;

import week04.mission01.one.GRADE;
import week04.mission01.one.Member;
import week04.mission01.one.MemberShipManagement;

import java.util.*;

public class MemberShipManagementTreeSet implements MemberShipManagement {
    private TreeSet<Member> memberTreeSet;

    public MemberShipManagementTreeSet() {
//        memberTreeSet = new TreeSet<>(Comparator.comparingInt(Member::getId));
        memberTreeSet = new TreeSet<>(Comparator.comparing(Member::getName));
    }

    @Override
    public void addMemberShip(int id, String name, GRADE grade) {
        if (!memberTreeSet.add(new Member(id, name, grade))){
//            System.out.println("이미 있는 아이디"+id+"는 추가할 수 없습니다");
            System.out.println("이미 있는 이름"+name+"는 추가할 수 없습니다");
        }
    }

    @Override
    public void showAllMember() {
        StringBuilder sb = new StringBuilder();
        sb.append(boundary);
        for (Member m : memberTreeSet) {
            sb.append(m.getName()+"님의 아이디는 ");
            sb.append(m.getId() + "이고 등급은 ");
            sb.append(m.getGrade() + "입니다.\n");
        }
        sb.append(boundary);

        System.out.print(sb);
    }

    @Override
    public boolean removeMember(int id) {
        for (Member m : memberTreeSet) {
            if (m.getId() == id) {
                memberTreeSet.remove(m);
                return true;
            }
        }
        System.out.println(id + "에 해당하는 멤버가 없습니다.");
        return false;
    }

}
