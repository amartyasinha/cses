import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            long t = scanner.nextLong();

            for (long i = 0; i < t; i++){
                long y = scanner.nextLong();
                long x = scanner.nextLong();
                System.out.println(infiniteGrid(y, x));
            }
        }
    }

    private static long infiniteGrid(long y, long x) {
        if (y > x){
            if ((y & 1) == 1){
                return (y - 1) * (y - 1) + x;
            } else {
                return y * y - x + 1;
            }
        } else {
            if ((x & 1) == 1){
                return x * x - y + 1;
            } else {
                return (x - 1) * (x - 1) + y;
            }
        }
    }
}
