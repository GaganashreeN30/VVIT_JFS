import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- 1. Basic if / else-if / else Ladder ---
        System.out.print("Enter test score: ");
        int score = scanner.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("Invalid score entered.");
        } else if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        // --- 2. Simplified Logical Conditions ---
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Do you have a valid ID? (true/false): ");
        boolean hasId = scanner.nextBoolean();

        if (age >= 18 && hasId) {
            System.out.println("Entry permitted: Verified adult.");
        } else if (age >= 18 && !hasId) {
            System.out.println("Entry denied: Missing valid ID.");
        } else {
            System.out.println("Entry denied: Underage.");
        }

        // --- 3. Ternary Operator ---
        System.out.print("Enter a number to check parity: ");
        int number = scanner.nextInt();
        String parity = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + parity);

        scanner.close();
    }
}