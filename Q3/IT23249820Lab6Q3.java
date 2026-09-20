import java.util.Scanner;

public class IT23249820Lab6Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sumOfSquares = 0.0;
        int count = 0;

        System.out.println(
                "Enter positive integers (terminate input with -99):"
        );

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        while (number != -99) {

            if (number <= 0) {

                System.out.println(
                        "Invalid input. Please enter a positive "
                                + "integer or -99 to terminate"
                );

            } else {

                sumOfSquares =
                        sumOfSquares + ((double) number * number);

                count++;
            }

            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        if (count > 0) {

            double meanOfSquares = sumOfSquares / count;
            double rootMeanSquare = Math.sqrt(meanOfSquares);

            System.out.println();
            System.out.println(
                    "The Root Mean Square (RMS) is: "
                            + rootMeanSquare
            );

        } else {

            System.out.println();
            System.out.println(
                    "No positive numbers were entered."
            );
        }

        input.close();
    }
}