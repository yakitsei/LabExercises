import java.util.Scanner;

public class LabExercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade on the following subjects.");
        System.out.print("English: ");
        int english = input.nextInt();
        System.out.print("Science: ");
        int science = input.nextInt();
        System.out.print("Math: ");
        int math = input.nextInt();
        System.out.print("MAPEH: ");
        int mapeh = input.nextInt();
        int sum = english + science + math + mapeh;
        double average = (sum + 0.0) / 4;
        System.out.println("Average: " + average);
        input.close();
    }
}

