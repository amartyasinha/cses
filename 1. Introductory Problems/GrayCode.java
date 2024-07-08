import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
                ) {
            int n = Integer.parseInt(br.readLine());

            List<String> res = getGrayCode(n);
            for (String ele : res) {
                bw.write(ele);
                bw.newLine();
            }
//            bw.write(String.valueOf(getGrayCode(n)));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static List<String> getGrayCode(int n) {

        List<String> lst = new ArrayList<>();
        if (n == 1) {
            lst.add("0");
            lst.add("1");
            return lst;
        }

        List<String> prev = getGrayCode(n-1);
        int lenOfPrev = prev.size();

        for (String s : prev) {
            lst.add("0" + s);
        }

        for (int i = lenOfPrev - 1; i >= 0; i--) {
            lst.add("1" + prev.get(i));
        }
        return lst;
    }
}
