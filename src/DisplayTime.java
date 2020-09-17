import java.util.Scanner;
    public class DisplayTime {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Prompt the user for input
            System.out.print("Tryk ind en integer for sekunder: ");
            int sekunder = input.nextInt();

            MinSec(sekunder);
        }
        public static void MinSec(double sekunder) {

            double minutter = sekunder / 60; // Find minutter i seunder
            double SekunderTilbage = sekunder % 60; // Sekunder tilbage
            System.out.println(sekunder + " sekunder er " + minutter +
                    " minutter og " + SekunderTilbage + " sekunder");
        }
    }

