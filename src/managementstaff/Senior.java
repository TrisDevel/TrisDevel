package managementstaff;
import java.util.Date;
class Senior extends Employee {
    private int yearsOfExperience;
    private String professionalSkills;

    public Senior(int ID, String name, Date birthDate, String phoneNumber, String email,
            int yearsOfExperience, String professionalSkills) {
        super(ID, name, birthDate, phoneNumber, email);
        this.yearsOfExperience = yearsOfExperience;
        this.professionalSkills = professionalSkills;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getProfessionalSkills() {
        return professionalSkills;
    }

    public void setProfessionalSkills(String professionalSkills) {
        this.professionalSkills = professionalSkills;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Professional Skills: " + professionalSkills);
    }
}
