import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++) {
            
            System.out.print("Enter Operator: ");
            char ope = scan.readLine().charAt(0);

            if(ope == '+') {
                System.out.print("Enter first number: ");
                int num1 = Integer.parseInt(scan.readLine());
                System.out.print("Enter second number: ");
                int num2 = Integer.parseInt(scan.readLine());
                System.out.println("Sum: " + (num1 + num2));
                i--;
            } else if(ope == '-') {
                System.out.print("Enter first number: ");
                int num1 = Integer.parseInt(scan.readLine());
                System.out.print("Enter second number: ");
                int num2 = Integer.parseInt(scan.readLine());
                System.out.println("Difference: " + (num1 - num2));
                i--;
            } else if(ope == '*') {
                System.out.print("Enter first number: ");
                int num1 = Integer.parseInt(scan.readLine());
                System.out.print("Enter second number: ");
                int num2 = Integer.parseInt(scan.readLine());
                System.out.println("Product: " + (num1 * num2));
                i--;
            } else if(ope == '/') {
                System.out.print("Enter first number: ");
                Double num1 = Double.parseDouble(scan.readLine());
                System.out.print("Enter second number: ");
                Double num2 = Double.parseDouble(scan.readLine());
                System.out.println("Quotient: " + (num1 / num2));
                i--;
            } else if(ope == 's') { 
                break;
            } else {
                System.out.println("Invalid Input");
                i--;
            }
        }
    }
}
