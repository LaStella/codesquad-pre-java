package week04.mission01.one.list;

import week04.mission01.one.GRADE;
import week04.mission01.one.Member;
import week04.mission01.one.MemberShipManagement;

import java.util.ArrayList;

public class MemberShipManagementList implements MemberShipManagement {
    private ArrayList<Member> memberArrayList;

    public MemberShipManagementList() {
        memberArrayList = new ArrayList<>();
    }

    @Override
    public void addMemberShip(int id, String name, GRADE grade) {
        memberArrayList.add(new Member(id, name, grade));
    }

    @Override
    public void showAllMember() {
        StringBuilder sb = new StringBuilder();
        sb.append(boundary);
        for (Member m : memberArrayList) {
            sb.append(m.getName()+"님의 아이디는 ");
            sb.append(m.getId() + "이고 등급은 ");
            sb.append(m.getGrade() + "입니다.\n");
        }
        sb.append(boundary);

        System.out.print(sb);
    }

    @Override
    public boolean removeMember(int id) {
        for (Member m : memberArrayList) {
            if (m.getId() == id) {
                memberArrayList.remove(m);
                return true;
            }
        }
        System.out.println(id + "에 해당하는 멤버가 없습니다.");
        return false;
    }

}
