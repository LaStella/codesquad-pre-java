package week04.mission01.one.map;

import week04.mission01.one.GRADE;
import week04.mission01.one.Member;
import week04.mission01.one.MemberShipManagement;

import java.util.*;

public class MemberShipManagementMap implements MemberShipManagement {
    private HashMap<Integer, Member> memberHashMap;

    public MemberShipManagementMap() {
        memberHashMap = new HashMap<>();
    }

    @Override
    public void addMemberShip(int id, String name, GRADE grade) {
        if (memberHashMap.containsKey(id)){
            System.out.println("이미 있는 아이디"+id+"의 값이 변경됩니다.");
        }
        memberHashMap.put(id, new Member(id, name, grade));
    }

    @Override
    public void showAllMember() {
        StringBuilder sb = new StringBuilder();
        sb.append(boundary);
        for (Member m : memberHashMap.values()) {
            sb.append(m.getName()+"님의 아이디는 ");
            sb.append(m.getId() + "이고 등급은 ");
            sb.append(m.getGrade() + "입니다.\n");
        }
        sb.append(boundary);

        System.out.print(sb);
    }

    @Override
    public boolean removeMember(int id) {
        if (memberHashMap.containsKey(id)) {
            memberHashMap.remove(id);
            return true;
        }
        System.out.println(id + "에 해당하는 멤버가 없습니다.");
        return false;
    }

}
