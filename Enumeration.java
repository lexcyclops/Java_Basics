enum version {
    LOW,
    MEDIUM,
    HIGH,
    CRITICAL
}

public class Enumeration{
    public static void main(String[] args) {
        
        version myBug = version.LOW;

        switch(myBug) {
            case CRITICAL:
            System.out.println("ALERT: Patch Immediately!");
            break;
            case HIGH:
            System.out.println("WARNING: Fix as soon as possible!");
            break;
            case MEDIUM:
            case LOW:
            System.out.println("INFO: Low priority bug.");
            break;
        }
    }

}
