import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Enter the year the employee joined the organization: ");
        int joinYear = scanner.nextInt();
        int yearsOfService = currentYear - joinYear;
        int bonus = 0;
        if (yearsOfService > 5) {
            bonus = 5000;
        } else if (yearsOfService >= 3) {
            bonus = 3000;
        }
        if (bonus > 0) {
            System.out.println("Congratulations! You have been awarded a bonus of Rs. " + bonus + "/-");
        } else {
            System.out.println("Sorry, no bonus is awarded for your years of service.");
        }

        scanner.close();
    }
}
