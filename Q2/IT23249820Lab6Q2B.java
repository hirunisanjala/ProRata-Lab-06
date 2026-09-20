import java.util.Scanner;

public class IT23249820Lab6Q2B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        String enteredNumbers = "";

        System.out.println("Please enter 10 numbers:");

        while (counter <= 10) {

            System.out.print("Enter number " + counter + ": ");
            int number = input.nextInt();

            enteredNumbers = enteredNumbers + number + " ";

            counter++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(enteredNumbers);

        input.close();
    }
}