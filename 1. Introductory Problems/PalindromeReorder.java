import java.io.*;

public class PalindromeReorder {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
                ){
            StringBuilder str = new StringBuilder(br.readLine());

            if (isPalindrome(str)) {
                bw.write(String.valueOf(str));
            } else {
                bw.write(String.valueOf(makePalindrome(str)));
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static StringBuilder makePalindrome(StringBuilder str) {
        int[] counting = new int[26];

        for (int i = 0; i < str.length(); i++){
            counting[str.charAt(i) - 'A'] += 1;
        }
        int totalOdds = 0;

        for (int i = 0; i < 26; i++) {
            if ((counting[i] & 1) == 1) {
                totalOdds++;
            }
        }
        if (totalOdds > 1) {
            return new StringBuilder("NO SOLUTION");
        }

        char[] newstr = new char[str.length()];
        int left = 0, right = str.length() - 1;

        // add all elements in the start and end
        for (int i = 0; i < 26; i++){
            while (counting[i] > 1) {
                newstr[left++] = (char) ('A' + i);
                newstr[right--] = (char) ('A' + i);
                counting[i] -= 2;
            }
        }

        // add the single odd element in the middle
        for (int i = 0; i < 26; i++) {
            if (counting[i] == 1) {
                newstr[str.length()/2] = (char) ('A' + i);
            }
        }

        StringBuilder myans = new StringBuilder();
        for (char x : newstr) {
            myans.append(x);
        }
        return myans;
    }

    private static boolean isPalindrome(StringBuilder str) {
        long len = str.length();

        for (long i = 0; i < len/2; i++) {
            if (str.charAt((int) i) != str.charAt((int) (len - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
