import java.util.Scanner;

public class oopsbannerapp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double salary[] = new double[10];
        double years[] = new double[10];
        double bonus[] = new double[10];
        double newSalary[] = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Enter salary of employee " + (i+1) + ": ");
            salary[i] = sc.nextDouble();

            System.out.println("Enter years of service of employee " + (i+1) + ": ");
            years[i] = sc.nextDouble();

            if(salary[i] <= 0 || years[i] < 0)
            {
                System.out.println("Invalid input. Please enter again.");
                i--; // repeat input for the same employee
            }
        }

        // Calculating bonus and new salary
        for(int i = 0; i < 10; i++)
        {
            if(years[i] > 5)
            {
                bonus[i] = salary[i] * 0.05;
            }
            else
            {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Employee " + (i+1));
            System.out.println("Old Salary: " + salary[i]);
            System.out.println("Bonus: " + bonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
            System.out.println();
        }

        System.out.println("Total Old Salary of all employees: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary of all employees: " + totalNewSalary);

        sc.close();
    }
}