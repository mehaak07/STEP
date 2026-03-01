import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Celsius input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Celsius to Fahrenheit conversion
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output
        System.out.println("The " + celsius + 
                           " celsius is " + 
                           fahrenheitResult + 
                           " fahrenheit");

        sc.close();
    }
}