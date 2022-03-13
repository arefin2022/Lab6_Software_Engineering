import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {
        double operand1, operand2, result;
        int option;
        Scanner scanner = new Scanner(System.in);
        //ask for operand
        System.out.print("Enter first operand: ");
        operand1 = scanner.nextDouble();
        System.out.print("Enter second operand: ");
        operand2 = scanner.nextDouble();

        //display menu
        System.out.println("Calculation Option");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");

        System.out.print("Which operation do you want to perform? ");
        option = scanner.nextInt();

        //addition
        if (option==1){
            result = operand1 + operand2;
            System.out.println("The result of the operation is "+ result);
        }
        //subtraction
        else if (option==2) {
            result = operand1 - operand2;
            System.out.println("The result of the operation is " + result);
        }
        //Error message
        else {
                System.out.println("Error: Invalid selection! Terminating program.");
            }
    }
}
