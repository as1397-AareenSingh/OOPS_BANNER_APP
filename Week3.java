import java.util.Scanner;

public class Week3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double number3 = sc.nextDouble();

        boolean isSmallest = (number1 < number2) && (number1 < number3);

        System.out.println("Is the first number the smallest? " + isSmallest);

        sc.close();
    }
}