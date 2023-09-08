import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LabExercise9 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= 1; i++) {
            System.out.print("Enter operator: ");
            char operator = input.readLine().charAt(0);
            if (operator == '+') {
                System.out.print("Enter first number: ");
                int num1 = Integer.parseInt(input.readLine());
                System.out.print("Enter second number: ");
                int num2 = Integer.parseInt(input.readLine());
                System.out.println("Answer: " + (num1 + num2));
                i--;
            } else if (operator == '-') {
                System.out.print("Enter first number: ");
                int num1 = Integer.parseInt(input.readLine());
                System.out.print("Enter second number: ");
                int num2 = Integer.parseInt(input.readLine());
                System.out.println("Answer: " + (num1 - num2));
                i--;
            } else if (operator == '*') {
                System.out.print("Enter first number: ");
                int num1 = Integer.parseInt(input.readLine());
                System.out.print("Enter second number: ");
                int num2 = Integer.parseInt(input.readLine());
                System.out.println("Answer: " + (num1 * num2));
                i--;
            } else if (operator == '/') {
                System.out.print("Enter first number: ");
                float num1 = Float.parseFloat(input.readLine());
                System.out.print("Enter second number: ");
                float num2 = Float.parseFloat(input.readLine());
                System.out.println("Answer: " + (num1 / num2));
                i--;
            } else if (operator == 's') {
                System.out.println("Thank You");
                break;
            } else {
                System.out.println("Invalid");
                i--;
            }
        }
        input.close();
    }
}

