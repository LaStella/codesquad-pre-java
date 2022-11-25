package week04.mission01.one;

public class Member {
    protected int id;
    protected String name;
    protected GRADE grade;

    public Member() {

    }

    public Member(int id, String name, GRADE grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(GRADE grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GRADE getGrade() {
        return grade;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            return this.hashCode() == obj.hashCode();
        }
        return false;
    }
}
