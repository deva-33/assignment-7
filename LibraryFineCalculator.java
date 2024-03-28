import java.util.Scanner;
public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();
        double fine = 0;
        if (daysLate <= 7) {
            fine = daysLate * 0.50;
        } else if (daysLate <= 14) {
            fine = 7 * 0.50 + (daysLate - 7) * 1.00;
        } else if (daysLate <= 21) {
            fine = 7 * 0.50 + 7 * 1.00 + (daysLate - 14) * 5.00;
        } else {
            System.out.println("Your membership is canceled due to returning the book after 21 days.");
            System.exit(0);
        }
        System.out.println("Fine: Rs. " + fine);
        scanner.close();
    }
}
