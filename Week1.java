import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert sq cm to sq inches
        double areaSqIn = areaSqCm / 6.4516;

        System.out.println("The Area of the triangle in sq in is "
                + areaSqIn + " and sq cm is " + areaSqCm);

        sc.close();
    }
}