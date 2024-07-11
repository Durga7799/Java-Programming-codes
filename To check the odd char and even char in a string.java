import java.util.Scanner;
public class OddEvenCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Characters at odd positions: ");
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) { 
                System.out.print(input.charAt(i) + " ");
            }
        }
        System.out.println();
        System.out.print("Characters at even positions: ");
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 != 0) { 
                System.out.print(input.charAt(i) + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
