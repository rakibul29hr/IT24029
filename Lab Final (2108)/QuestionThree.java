import java.util.Scanner;

public class QuestionThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sample Input:");

        System.out.print("Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("No. of Courses: ");
        int numberOfCourses = scanner.nextInt();

        double totalCreditTaken = 0;
        double totalWeightedGP = 0;
        double totalCreditEarned = 0;
        for (int i = 1; i <= numberOfCourses; i++) {
            System.out.println("\nC" + i + ":");

            System.out.print("Credit (Max 3): ");
            double credit = scanner.nextDouble();

            System.out.print("CT (Max 30): ");
            double ct = scanner.nextDouble();

            System.out.print("AT (Max 10): ");
            double at = scanner.nextDouble();

            System.out.print("FE (Max 60): ");
            double fe = scanner.nextDouble();


            double totalMarks = ct + at + fe;
            double gp = getGradePoint(totalMarks);

            totalCreditTaken += credit;
            totalWeightedGP += (credit * gp);
            if (gp > 0) {
                totalCreditEarned += credit;
            }
        }
        double cgpa = 0.0;
        if (totalCreditTaken > 0) {
            cgpa = totalWeightedGP / totalCreditTaken;
        }

        String finalGrade = getGradeLetter(cgpa);

        System.out.println("\nSample Output:");
        System.out.println("Student ID: " + studentId);

        System.out.println("Credit Taken: " + (int)totalCreditTaken);
        System.out.println("Credit Earned: " + (int)totalCreditEarned);

        System.out.printf("CGPA: %.1f%n", cgpa);
        System.out.println("Grade: " + finalGrade);

        scanner.close();
    }
    public static double getGradePoint(double marks) {
        if (marks >= 80) return 4.00;
        else if (marks >= 75) return 3.75;
        else if (marks >= 70) return 3.50;
        else if (marks >= 65) return 3.25;
        else if (marks >= 60) return 3.00;
        else if (marks >= 55) return 2.75;
        else if (marks >= 50) return 2.50;
        else if (marks >= 45) return 2.25;
        else if (marks >= 40) return 2.00;
        else return 0.00;
    }


    public static String getGradeLetter(double cgpa) {
        if (cgpa >= 4.00) return "A+";
        else if (cgpa >= 3.75) return "A";
        else if (cgpa >= 3.50) return "A-";
        else if (cgpa >= 3.25) return "B+";
        else if (cgpa >= 3.00) return "B";
        else if (cgpa >= 2.75) return "B-";
        else if (cgpa >= 2.50) return "C+";
        else if (cgpa >= 2.25) return "C";
        else if (cgpa >= 2.00) return "D";
        else return "F";
    }
}