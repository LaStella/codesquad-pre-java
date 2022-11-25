package week04.mission01.one;

public interface MemberShipManagement {
    final String boundary = "=================================\n";
    void addMemberShip(int id, String name, GRADE grade);
    void showAllMember();
    boolean removeMember(int id);
}
