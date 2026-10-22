public class AccessCheck {
    public static void main(String[] args) {
        // Hardcoded integer variables as instructed
        int userAge = 17;
        int securityPin = 4321;

        // Use a simple if statement:
        // If userAge is 18 or greater, print "Adult Account Verified."
        if (userAge >= 18) {
            System.out.println("Adult Account Verified.");
        }

        // Use an if-else statement:
        // If securityPin equals 4321, print "Access Granted";
        // otherwise, print "Access Denied: Invalid PIN".
        if (securityPin == 4321) {
            System.out.print("Access Granted");
        } else {
            System.out.print("Access Denied: Invalid PIN");
        }
    }
}
