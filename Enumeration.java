enum Severity {
    LOW,
    MEDIUM,
    HIGH,
    CRITICAL
}

public class Enumeration{
    public static void main(String[] args) {
        
        Severity myBug = Severity.LOW;

        if (myBug == Severity.CRITICAL) {
            System.out.println("ALERT: Patch Immediately!");
        } else if (myBug == Severity.HIGH) {
            System.out.println("WARNING: Fix as soon as possible!");
        } else {
            System.out.println("INFO: Low priority bug.");
        }
    }

}
