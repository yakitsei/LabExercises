public class LabExercise10 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        System.out.println("Hello BSIT!");
        System.out.print("My Array = 0, ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
            sum += numbers[i];
        }
        System.out.println("\nThe sum is " + sum);
    }
}


