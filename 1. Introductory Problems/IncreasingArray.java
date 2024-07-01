import java.util.Scanner;

public class IncreasingArray {

    public static int IncreasingArrayFunc(int[] arr){
        int totalCount = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length-1; j++){
                if (arr[i]>arr[j]){
                    arr[j] += arr[j];
                }
            }
            totalCount++;
        }
        return totalCount;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter number: ");
            int num = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter all numbers by space: ");
            String str = scanner.nextLine();

            String[] strArr = str.split(" ");

            int[] arr = new int[strArr.length];

            for (int i = 0; i < strArr.length; i++){
                arr[i] = Integer.parseInt(strArr[i]);
            }
            System.out.println(IncreasingArrayFunc(arr));
        }
    }
}
