import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created --> FirstName : " + firstName +
                " LastName : " + lastName);
        this.department = setDepartment();
        System.out.println("Department : " + this.department);
    }

    private String setDepartment() {

        System.out.print("Enter the department\n1 for Sales\n2 for Development" +
                "\n3 for Accounting\n0 for none");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if (departmentChoice == 1) {
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Development";
        } else if (departmentChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }
}
