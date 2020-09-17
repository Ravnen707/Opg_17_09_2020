import java.util.Scanner;

public class copy_try {

    public static void main(String[] args) {
            // Create a Scanner
            Scanner input = new Scanner(System.in);
            // Enter yearly interest rate
            System.out.print("Enter yearly interest rate, for example 8.25: ");
            double arrente = input.nextDouble();
            // Obtain monthly interest rate
            double rente = arrente / 1200;
            // Enter number of years
            System.out.print(
                    "Enter number of years as an integer, for example 5: ");
            int antalar = input.nextInt();
            // Enter loan amount
            System.out.print("Enter loan amount, for example 120000.95: ");
            double lanmængde = input.nextDouble();
            double[] array = beregning(lanmængde, rente, antalar);
            // Display results
            System.out.println("The monthly payment is $" +
                    (int)(array[0] * 100) / 100.0);
            System.out.println("The total payment is $" +
                    (int)(array[1] * 100) / 100.0);
        }

        public static double[] beregning(double antalar, double lanmængde, double rente) {
            double a1 = lanmængde * rente / (1
                    - 1 / Math.pow(1 + rente, antalar * 12));
            double a2 = a1 * antalar * 12;
            return new double[] {a1,a2};
        }
    }

