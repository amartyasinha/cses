import java.util.Scanner;

public class IncreasingArray {

    public static long IncreasingArrayFunc(long[] arr, int num){
        long totalCount = 0;

        for (int i = 1; i < num; i++){
            if (arr[i-1]>arr[i]){
                totalCount += arr[i-1] - arr[i];
                arr[i] = arr[i-1];
            }
        }
        return totalCount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
//            System.out.print("Enter number: ");
            int num = Integer.parseInt(scanner.nextLine());

//            System.out.print("Enter all numbers by space: ");
            String str = scanner.nextLine();

            String[] strArr = str.split(" ");

            long[] arr = new long[strArr.length];

            for (int i = 0; i < strArr.length; i++){
                arr[i] = Long.parseLong(strArr[i]);
            }
            System.out.println(IncreasingArrayFunc(arr, num));
        }
    }
}
