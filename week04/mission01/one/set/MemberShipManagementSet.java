package week04.mission01.one.set;

import week04.mission01.one.GRADE;
import week04.mission01.one.Member;
import week04.mission01.one.MemberShipManagement;

import java.util.*;

public class MemberShipManagementSet implements MemberShipManagement {
    private HashSet<Member> memberHashSet;

    public MemberShipManagementSet() {
        memberHashSet = new HashSet<>();
    }

    @Override
    public void addMemberShip(int id, String name, GRADE grade) {
        if (!memberHashSet.add(new Member(id, name, grade))){
            System.out.println("이미 있는 아이디"+id+"는 추가할 수 없습니다");
        }
    }

    @Override
    public void showAllMember() {
        StringBuilder sb = new StringBuilder();
        sb.append(boundary);
        for (Member m : memberHashSet) {
            sb.append(m.getName()+"님의 아이디는 ");
            sb.append(m.getId() + "이고 등급은 ");
            sb.append(m.getGrade() + "입니다.\n");
        }
        sb.append(boundary);

        System.out.print(sb);
    }

    @Override
    public boolean removeMember(int id) {
        for (Member m : memberHashSet) {
            if (m.getId() == id) {
                memberHashSet.remove(m);
                return true;
            }
        }
        System.out.println(id + "에 해당하는 멤버가 없습니다.");
        return false;
    }

}
