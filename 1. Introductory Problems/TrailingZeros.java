import java.io.*;

public class TrailingZeros {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
                ){
            long num = Long.parseLong(br.readLine());

            bw.write(String.valueOf(countZeros(num)));
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    private static long countZeros(long num) {
        long count = 0;

        for (int i = 5; num/i >= 1; i *= 5){
            count += num/i;
        }
        return count;
    }
}
