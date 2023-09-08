import java.util.Scanner;

public class LabExercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter operator: ");
            char operator = input.next().charAt(0);
            if (operator == '+') {
                System.out.print("Enter first number: ");
                int num1 = input.nextInt();
                System.out.print("Enter second number: ");
                int num2 = input.nextInt();
                System.out.println("Answer: " + (num1 + num2));
            } else if (operator == '-') {
                System.out.print("Enter first number: ");
                int num1 = input.nextInt();
                System.out.print("Enter second number: ");
                int num2 = input.nextInt();
                System.out.println("Answer: " + (num1 - num2));
            } else if (operator == '*') {
                System.out.print("Enter first number: ");
                int num1 = input.nextInt();
                System.out.print("Enter second number: ");
                int num2 = input.nextInt();
                System.out.println("Answer: " + (num1 * num2));
            } else if (operator == '/') {
                System.out.print("Enter first number: ");
                float num1 = input.nextFloat();
                System.out.print("Enter second number: ");
                float num2 = input.nextFloat();
                System.out.println("Answer: " + (num1 / num2));
            } else if (operator == 's') {
                System.out.println("Bye!");
                break;
            }
        }
        input.close();
    }
}

