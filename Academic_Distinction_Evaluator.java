public class AcademicEvaluator {
    public static void main(String[] args) {
        // Hardcode the student's values as instructed
        double gwa = 94.5;
        int lowestGrade = 88;

        // Outer if-else: Check if gwa >= 90.0.
        if (gwa >= 90.0) {
            // If true, check if lowestGrade >= 85.
            if (lowestGrade >= 85) {
                // If true, check GWA brackets for specific honors.
                if (gwa >= 98.0) {
                    System.out.print("Academic Status: With Highest Honors");
                } else if (gwa >= 95.0) {
                    System.out.print("Academic Status: With High Honors");
                } else if (gwa >= 90.0) {
                    System.out.print("Academic Status: With Honors");
                }
            } else {
                // If false (lowest grade below 85), print disqualification message.
                System.out.print("Academic Status: Honors Disqualified due to grade below minimum requirement");
            }
        } else {
            // If false, print "Regular Passing Grade".
            System.out.print("Academic Status: Regular Passing Grade");
        }
    }
}
