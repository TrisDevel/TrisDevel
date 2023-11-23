package managementstaff;
import java.util.Date;
public class Employee {
    private int ID;
    private String name;
    private Date birthDate;
    private String phoneNumber;
    private String email;

    public Employee(int ID, String name, Date birthDate, String phoneNumber, String email) {
        this.ID = ID;
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void showInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Birth: " + birthDate);
        System.out.println("Phone Num: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}

