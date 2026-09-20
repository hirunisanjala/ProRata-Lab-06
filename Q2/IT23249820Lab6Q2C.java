import java.util.Scanner;

public class IT23249820Lab6Q2C {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        String enteredNumbers = "";

        System.out.println("Please enter 10 numbers:");

        while (counter <= 10) {

            System.out.print("Enter number " + counter + ": ");
            int number = input.nextInt();

            enteredNumbers = enteredNumbers + number + " ";
            sum = sum + number;

            counter++;
        }

        double average = sum / 10.0;

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(enteredNumbers);

        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}