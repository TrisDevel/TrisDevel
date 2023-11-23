package managementstaff;
import java.util.Date;
public class Intern extends Employee{
    private String major;
    private String semester;
    private String school;

    public Intern(int ID, String name, Date birthDate, String phoneNumber, String email, String major,
            String semester, String school) {
        super(ID, name, birthDate, phoneNumber, email);
        this.major = major;
        this.semester = semester;
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Major: " + major);
        System.out.println("Semester: " + semester);
        System.out.println("School: " + school);
    }
}

