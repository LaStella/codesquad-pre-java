package week04.mission01.one.set;

import week04.mission01.one.GRADE;

public class MemberShipManagementSetTest {
    public static void main(String[] args) {
        MemberShipMangementSet management = new MemberShipMangementSet();
        management.addMemberShip(1001, "Hong", GRADE.RED);
        management.addMemberShip(1002, "Park", GRADE.PLATINUM);
        management.addMemberShip(1003, "Kim", GRADE.DIAMOND);

        System.out.println("모든 멤버 보여주기: ");
        management.showAllMember();

        System.out.println("존재 하는 아이디를 지웠을때 :");
        if(management.removeMember(1001)) {
            management.showAllMember();
        }

        System.out.println("존재 하지 않는 아이디를 지우려 할때:");
        if(management.removeMember(1005)) {
            management.showAllMember();
        }

        System.out.println("이미 존재 하는 아이드를 추가하려 할때:");
        management.addMemberShip(1002, "Lee", GRADE.PLATINUM);

        management.showAllMember();
    }
}
