import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TwoSets {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
                ) {
            long n = Long.parseLong(br.readLine());
            MakeTwoSets(n);
        } catch (IOException e){
            System.err.println("Err" + e.getMessage());
        }
    }

    private static void MakeTwoSets(long n) {
        long totalSum = (n * (n + 1)) / 2;
        if ((totalSum & 1) == 1){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
            long maxNum = n;
            boolean[] isUsed = new boolean[(int) n+1];

            List<Long> set1 = new ArrayList<>();
            List<Long> set2 = new ArrayList<>();

            long set1Sum = 0;

            while (set1Sum < totalSum/2) {

                long remainingSum = totalSum/2 - set1Sum;
                if (remainingSum > maxNum) {
                    set1Sum += maxNum;
                    set1.add(maxNum);
                    isUsed[(int) maxNum] = true;
                    maxNum--;
                } else {
                    set1Sum += remainingSum;
                    set1.add(remainingSum);
                    isUsed[(int) remainingSum] = true;
                }
            }
            for (long i = 1; i <= n; i++) {
                if (!isUsed[(int) i]) {
                    set2.add(i);
                }
            }
            System.out.println(set1.size());
            for (long x : set1){
                System.out.print(x + " ");
            }
            System.out.println();
            System.out.println(set2.size());
            for (long y : set2) {
                System.out.print(y + " ");
            }
        }
    }
}
