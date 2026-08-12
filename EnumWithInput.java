import java.util.Scanner; 

enum Severity {
    LOW,
    MEDIUM,
    HIGH,
    CRITICAL
}


public class EnumWithInput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Severity Level (LOW, MEDIUM, HIGH, CRITICAL): ");
        String input = scanner.nextLine().trim().toUpperCase();

        if (input.equals("CRITICAL")) {
            System.out.println("ALERT: Patch Immediately!");
        } else if (input.equals("HIGH")) {
            System.out.println("WARNING: Fix as soon as possible!");
        } else if (input.equals("MEDIUM") || input.equals("LOW")) {
            System.out.println("INFO: Low priority bug.");
        } else {

            System.out.println("ERROR: Invalid Input! Please enter LOW, MEDIUM, HIGH, or CRITICAL.");
        }

        scanner.close();
    }
}