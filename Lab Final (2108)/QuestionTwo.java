import java.util.Scanner;

public class QuestionTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program is designed to exhibit the positive divisors of");
        System.out.println("positive integers supplied by you.  The program will repeatedly");
        System.out.println("prompt you to enter a positive integer.  Each time you enter a");
        System.out.println("positive integer, the program will print all the divisors of your");
        System.out.println("integer in a column and in decreasing order.");
        System.out.println();
        boolean keepGoing = true;
        while (keepGoing) {
            int number = 0;
            while (true) {
                System.out.print("Please enter a positive integer: ");
                if (scanner.hasNextInt()) {
                    number = scanner.nextInt();

                    if (number > 0) {
                        break;
                    } else {
                        System.out.println(number + " is not a positive integer.");
                    }
                } else {
                    String invalid = scanner.next();
                    System.out.println(invalid + " is not a positive integer.");
                }
            }
            for (int i = number; i >= 1; i--) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
            System.out.println();

            while (true) {
                System.out.print("Would you like to see the divisors of another integer (Y/N)? ");
                String response = scanner.next();

                if (response.equalsIgnoreCase("y")) {
                    keepGoing = true;
                    break;
                } else if (response.equalsIgnoreCase("n")) {
                    keepGoing = false;
                    break;
                } else {

                    System.out.println("Please respond with Y (or y) for yes and N (or n) for no.");
                }
            }
        }

        scanner.close();
    }
}