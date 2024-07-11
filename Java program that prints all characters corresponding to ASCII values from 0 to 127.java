import java.util.Scanner;
public class AsciiCharactersWithUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting ASCII value: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending ASCII value: ");
        int end = scanner.nextInt();
        if (start < 0 || end > 127 || start > end) {
            System.out.println("Please enter a valid range between 0 and 127.");
        } else {
            for (int i = start; i <= end; i++) {
                System.out.println("ASCII value: " + i + " Character: " + (char) i);
            }
        }

        scanner.close();
    }
}
