import java.util.Scanner;


public class WeirdAlgorithm {

    public static StringBuilder WeirdAlgorithmFunc(long num) {

        StringBuilder result = new StringBuilder();
        result.append(num);

        while (num != 1) {
            num = ((num & 1) == 1) ? (3 * num + 1) : ( num / 2);
            result.append(" ").append(num);
        }
        return result;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            long input = scanner.nextLong();
            System.out.println(WeirdAlgorithmFunc(input));
        }
    }
}