import java.util.Scanner;

/**
 * WeirdAlgorithm
 */
public class WeirdAlgorithm {

    public static StringBuilder WeirdAlgorithmFunc(int num) {

        StringBuilder result = new StringBuilder();
        result.append(num);

        while (num != 1) {
            if (num % 2 == 1) {
                num = 3 * num + 1;
            }
            else {
                num /= 2;
            }
            result.append(" ").append(num);
        }

        return result;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your number: ");
            int input = scanner.nextInt();
            System.out.println(WeirdAlgorithmFunc(input));
        }
    }
}