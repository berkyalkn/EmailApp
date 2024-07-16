import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private final String COMPANY_SUFFIX = "company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase()
                + "." + COMPANY_SUFFIX;

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase()
                + "." + COMPANY_SUFFIX;

        this.password = generatePassword(defaultPasswordLength);
        System.out.println("Your Password : " + this.password);

    }

    private String setDepartment() {

        System.out.print("Enter the department\n1 for Sales\n2 for Development" +
                "\n3 for Accounting\n0 for none\nEnter department code : ");
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

    private String generatePassword(int length) {

        String passwordSet = "ABCDEFGHIJKLMNOPRSTUWXVYZ1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    public void setMailboxCapacity (int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "NAME: " + firstName + " " + lastName +
                "\nEMAIL: " + email +
                "\nDEPARTMENT " + department +
                "\nMAILBOX CAPACITY: " + mailboxCapacity;
    }
}
