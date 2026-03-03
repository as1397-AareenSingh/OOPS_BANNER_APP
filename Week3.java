import java.util.Scanner;

public class Week3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // -------------------------------
        // Part 1: Using Multiple If-Else
        // -------------------------------

        if (year < 1582) {
            System.out.println("Leap year calculation works only for year >= 1582");
        } else {

            boolean isLeap = false;

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeap = true;
                    } else {
                        isLeap = false;
                    }
                } else {
                    isLeap = true;
                }
            } else {
                isLeap = false;
            }

            if (isLeap) {
                System.out.println("Year is a Leap Year (Using multiple if-else)");
            } else {
                System.out.println("Year is not a Leap Year (Using multiple if-else)");
            }

            // ----------------------------------------
            // Part 2: Using Single If with Logical Operators
            // ----------------------------------------

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Year is a Leap Year (Using single if condition)");
            } else {
                System.out.println("Year is not a Leap Year (Using single if condition)");
            }
        }

        sc.close();
    }
}