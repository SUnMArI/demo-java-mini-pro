package optional;

public class Student {

    private int stuID;
    private String stuName ;
    private String stuGender ;

    public Student(int stuID, String stuName, String stuGender) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.stuGender = stuGender;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuID=" + stuID +
                ", stuName='" + stuName + '\'' +
                ", stuGender='" + stuGender + '\'' +
                '}';
    }
}
