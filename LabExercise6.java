import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LabExercise6 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter your name: ");
        String name = br.readLine();

        System.out.print("Enter your birth year: ");
        int userBirthYear = Integer.parseInt(br.readLine());
        int currentYear = 2023;

        System.out.println();

        System.out.print(name+ " You are now: " + (currentYear-userBirthYear) + " Years old");

        br.close();
    }
}



