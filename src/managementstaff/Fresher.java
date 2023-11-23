package managementstaff;
import java.util.Date;
public class Fresher extends Employee{
    private String graduationYear;
    private String graduationRank;
    private String graduationSchool;

    public Fresher(int ID, String name, Date birthDate, String phoneNumber, String email,
            String graduationYear, String graduationRank, String graduationSchool) {
        super(ID, name, birthDate, phoneNumber, email);
        this.graduationYear = graduationYear;
        this.graduationRank = graduationRank;
        this.graduationSchool = graduationSchool;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getGraduationSchool() {
        return graduationSchool;
    }

    public void setGraduationSchool(String graduationSchool) {
        this.graduationSchool = graduationSchool;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("Graduation Rank: " + graduationRank);
        System.out.println("Graduation School: " + graduationSchool);
    }
}
