import java.security.InvalidAlgorithmParameterException;
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

        try{

             Severity level=Severity.valueOf(input);

        if (level==Severity.CRITICAL) {
            System.out.println("ALERT: Patch Immediately!");
        } else if (level==Severity.HIGH) {
            System.out.println("WARNING: Fix as soon as possible!");
        } else if (level==Severity.MEDIUM || level==Severity.LOW) {
            System.out.println("INFO: Low priority bug.");
        }
        } catch (IllegalArgumentException e){

            System.out.println("ERROR: Invalid Input! Please enter LOW, MEDIUM, HIGH, or CRITICAL.");
        }

        scanner.close();
    }
}