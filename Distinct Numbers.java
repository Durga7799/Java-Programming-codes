import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        int distinctCount = countDistinctValues(n, values);
        System.out.println(distinctCount);
        scanner.close();
    }
    public static int countDistinctValues(int n, int[] values) {
        Set<Integer> distinctValues = new HashSet<>();
        for (int i = 0; i < n; i++) {
            distinctValues.add(values[i]);
        }
        return distinctValues.size();
    }
}
