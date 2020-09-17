import java.util.Scanner;

public class FehreinheitCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv ind en grad i Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius

        grader(fahrenheit);
    }
    public static void grader (double fahrenheit) {

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er " +
                celsius + " i Celsius");
    }
}

