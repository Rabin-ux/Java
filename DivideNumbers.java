import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int num = sc.nextInt();
        System.out.print("Enter denominator: ");
        int den = sc.nextInt();
        if (den == 0) {
            System.out.println("Error: Cannot divide by zero!");
        } else {
            double result = (double) num / den;
            System.out.println("Result: " + result);
        }
        sc.close();
    }
}
