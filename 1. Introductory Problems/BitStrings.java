import java.io.*;

public class BitStrings {

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int len = Integer.parseInt(br.readLine());
            long var = (long) Math.pow(2, len);

            bw.write(String.valueOf(var));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
