import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {
        double operand1, operand2, result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first operand: ");
        operand1 = scanner.nextDouble();
        System.out.print("Enter second operand: ");
        operand2 = scanner.nextDouble();

        result = operand1 + operand2;
        System.out.println("The result of the operation is "+ result);

    }
}
