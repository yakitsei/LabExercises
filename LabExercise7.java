import java.util.Scanner;

public class LabExercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birthyear: ");
        int userBirthYear = input.nextInt();

        if(userBirthYear < 2023 && userBirthYear > 0) {
            int age = 2023 - userBirthYear;
            if (age >= 18) {
                System.out.println(age + " and Legal age");
            } else {
                System.out.println(age + "and Minor");
            }
        } else {
            System.out.println("Invalid");
        }
        input.close();
    }
}

