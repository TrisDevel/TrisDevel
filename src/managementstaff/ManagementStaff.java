package managementstaff;
import java.util.Date;
public class ManagementStaff {

    public static void main(String[] args) {
          Senior employee1 = new Senior(123, "Ronaldo", new Date(), "1234567890",
                "huhu@gmail.com", 10, "Java");
        System.out.println("Employee with Experience:");
        employee1.showInfo();

        Fresher employee2 = new Fresher(245, "Messi", new Date(), "9876543210",
                "haha@gmail.com", "2022", "Bad", "FPT University");
        System.out.println("\nEmployee Fresh Graduate:");
        employee2.showInfo();

        Intern employee3 = new Intern(356, "Neymar", new Date(), "5555555555", "hihi@gmail.com",
                "KTPM", "Fall 2023", "FPT College");
        System.out.println("\nEmployee Intern:");
        employee3.showInfo();
    }
  }
    

