import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int t = scanner.nextInt();

            for (int i = 0; i < t; i++){
                int y = scanner.nextInt();
                int x = scanner.nextInt();
                System.out.println(infiniteGrid(y, x));
            }
        }
    }

    private static int infiniteGrid(int y, int x) {
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
