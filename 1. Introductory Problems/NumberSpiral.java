import java.io.*;
import java.util.StringTokenizer;

public class NumberSpiral {
    public static void main(String[] args) {
        try(
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
            long t = Long.parseLong(br.readLine());

            for (long i = 0; i < t; i++){
                StringTokenizer tk = new StringTokenizer(br.readLine());
                long y = Long.parseLong(tk.nextToken());
                long x = Long.parseLong(tk.nextToken());
                bw.write(String.valueOf(infiniteGrid(y, x)));
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error reading: " + e.getMessage());
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
