import java.util.Scanner;

public class Permutation {

    public static StringBuilder beautifulPermutation(long n){
        StringBuilder str = new StringBuilder();

        if (n == 2 || n == 3){
            return new StringBuilder("NO  SOLUTION");
        }
        for (long i = n-1; i >= 1; i -= 2){
            str.append(i).append(" ");
        }
        for (long i = n; i >= 1; i -= 2){
            str.append(i).append(" ");
        }
        return str;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            long num = scanner.nextLong();

            System.out.println(beautifulPermutation(num));
        }

    }
}
