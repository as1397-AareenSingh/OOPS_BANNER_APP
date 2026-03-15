import java.util.Scanner;

public class oopsbannerapp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String names[] = {"Amar", "Akbar", "Anthony"};
        int age[] = new int[3];
        double height[] = new double[3];

        // Taking input
        for(int i = 0; i < 3; i++)
        {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextDouble();
        }

        // Finding youngest
        int youngestIndex = 0;
        for(int i = 1; i < 3; i++)
        {
            if(age[i] < age[youngestIndex])
            {
                youngestIndex = i;
            }
        }

        // Finding tallest
        int tallestIndex = 0;
        for(int i = 1; i < 3; i++)
        {
            if(height[i] > height[tallestIndex])
            {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("Youngest friend is: " + names[youngestIndex] + " with age " + age[youngestIndex]);
        System.out.println("Tallest friend is: " + names[tallestIndex] + " with height " + height[tallestIndex]);

        sc.close();
    }
}