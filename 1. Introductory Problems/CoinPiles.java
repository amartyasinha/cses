import java.io.*;
import java.util.StringTokenizer;

public class CoinPiles {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
                ) {
            int t = Integer.parseInt(br.readLine());

            for (int i = 0; i < t; i++) {
                StringTokenizer tk = new StringTokenizer(br.readLine());
                long a = Long.parseLong(tk.nextToken());
                long b = Long.parseLong(tk.nextToken());
                bw.write(isPossible(a, b));
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static String isPossible(long a, long b) {

        /*
        For pile a, if 1 coin is taken x time and 2 coins taken y time, then a = x + 2y;
        and since when 1 coin is taken from a, 2 coin must be taken from b and vice versa
        it means if 1 coin is taken x time from a, then 2 coin are also taken x time from b
        and same is true for y.
        so we get these two equations
        a = x + 2y
        b = 2x + y
        from these equations, we get
        x = (2b-a)/3
        y = (2a-b)/3
        it means if we are going to take all coin from pile, it must be a whole number
        it implies that (2b-a)<0, (2a-b)<0, (2a-b)%3 != 0, and (2b-a)%3 !=0 will be only case
        when the rule will not be followed
         */

        if ( ((2*b - a) < 0) || ((2*a - b) < 0) || ((2*a - b)%3 != 0) || ((2*b - a)%3 != 0) ){
            return "NO";
        }
        return "YES";
    }
}
