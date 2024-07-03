import java.io.*;

public class TwoKnights {
    public static void main(String[] args) {
        try(
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
            long n = Long.parseLong(br.readLine());

            for (long i  = 1; i <= n; i++){
                bw.write(String.valueOf(SolveTwoKnights(i)));
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Err" + e.getMessage());
        }
    }

    private static long SolveTwoKnights(long n) {
        /* totalPosition where both knights can be will form a combination, so (n^2)!/r!(n^2-r)! combination.
           Squaring n bcz 3x3 board will have 9 places, to get all places, did squaring */
        long totalPosition = (n * n * ( n * n - 1)) / 2;
        /* a knight moves in L shape, thus the smallest block in which it can move is of 2x3 or 3x2.
           and in each smallest block, there are two attacking position.
           if we start covering a chess box with 3x2 and 2x3 blocks, we will need 2(n-1)(n-2) blocks */
        long attackPosition = 4*(n-1)*(n-2);
        return totalPosition - attackPosition;
    }
}
