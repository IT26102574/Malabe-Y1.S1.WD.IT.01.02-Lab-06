import java.util.Scanner;

public class IT26102574Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sum = 0;
        double rms;

        System.out.println("Enter positive numbers (-99 to stop):");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != -99) {

            if (number < 0) {
                System.out.println("Invalid input! Enter a positive number.");
            } else {
                sum = sum + (number * number);
                count++;
            }

            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        if (count > 0) {
            rms = Math.sqrt(sum / count);

            System.out.println("Root Mean Square = " + rms);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        input.close();
    }
}