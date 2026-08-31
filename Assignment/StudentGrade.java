import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cumulative percentage: ");
        double percentage = sc.nextDouble();

        try {
            if (percentage < 0 || percentage > 100) {
                throw new Exception("Percentage must be between 0 and 100.");
            }

            if (percentage >= 85) {
                System.out.println("Distinction");
            } else if (percentage >= 70) {
                System.out.println("First Class");
            } else {
                System.out.println("Not Eligible");
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}