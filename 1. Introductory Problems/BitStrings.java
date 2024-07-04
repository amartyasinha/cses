import java.io.*;

public class BitStrings {

    public static long MOD = 1000000007;
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            long expo = Long.parseLong(br.readLine());
            long base = 2;
            base %= MOD;
            bw.write(String.valueOf(calcPow(base, expo)));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static long calcPow(long base, long expo) {
        if (expo == 0) {
            return 1;
        }
        long halfRes = (calcPow(base, expo/2)%MOD);
        if ((expo & 1) == 1) {
            return (((halfRes*halfRes)%MOD)*base)%MOD;
        }
        return (halfRes*halfRes)%MOD;
    }
}
