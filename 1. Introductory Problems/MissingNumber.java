import java.util.Scanner;

public class MissingNumber {
    public static int MissingNumberFunc(int num, int[] arr){
        int arrSum = 0;
        for (int digit:arr){
            arrSum += digit;
        }
        int naturalSum = num * (num + 1) / 2;
        return naturalSum - arrSum;
    }
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.print("Enter number: ");
            int num = Integer.parseInt(scanner.nextLine());

//            System.out.printf("Enter string till %d: ", num);
            String line = scanner.nextLine();

            String[] string = line.split(" ");
            int[] arr = new int[string.length];

            for (int i = 0; i < string.length; i++) {
                arr[i] = Integer.parseInt(string[i]);
            }
            System.out.println(MissingNumberFunc(num, arr));
        }
    }
}
