import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking inputs in centimeters
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert square centimeters to square inches
        // 1 inch = 2.54 cm
        // 1 sq inch = (2.54)^2 = 6.4516 sq cm
        double areaInches = areaCm / (2.54 * 2.54);

        // Output
        System.out.println("The Area of the triangle in sq in is " 
                + areaInches + " and sq cm is " + areaCm);

        sc.close();
    }
}