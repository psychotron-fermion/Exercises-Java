import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height in m:");
        double height = input.nextDouble();
        System.out.println("Enter your weight in kg:");
        double weight = input.nextDouble();

        double bmi = weight/Math.pow(height, 2);
        System.out.println("Your BMI: " + bmi);

    }
}