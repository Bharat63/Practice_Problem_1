import java.util.Scanner;

public class NumberToWordsSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single-digit number (0-9): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 9) {
            System.out.println("Invalid input! Please enter a number between 0 and 9.");
        } else {
            String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            System.out.println("The number in words is: " + words[number]);
        }

        scanner.close();
    }
}
