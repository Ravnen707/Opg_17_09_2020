import java.util.Scanner;
public class ComputeLoan {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Enter yearly interest rate
        System.out.print("Put ind en årlig rente, som et eksempel 8.25: ");
        double årligerente = input.nextDouble();
        // Obtain monthly interest rate
        double rente = årligerente / 1200;
        // Enter number of years
        System.out.print(
                "Put in et nummer af år som en integer, for eksemple 5: ");
        int antalÅr = input.nextInt();
        // Enter loan amount
        System.out.print("Put ind lånte mængde, for eksemple 120000.95: ");
        double mængdeLånt = input.nextDouble();
        // Calculate payment
        double[] array = beregning(mængdeLånt, rente, antalÅr);
        // Display results
        System.out.println("måndelige udbetaling er DKK" +
                (int) (array[0] * 100) / 100.0);
        System.out.println("Totale udebetaling er DKK" +
                (int) (array[1] * 100) / 100.0);
    }

    public static double[] beregning(double antalÅr, double mængdeLånt, double rente) {

        double a = mængdeLånt * rente / (1
                - 1 / Math.pow(1 + rente,antalÅr * 12));
        double b = a * antalÅr * 12;
        return new double[] {a,b};
    }
}