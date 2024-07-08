import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());

            calcTowerOfHanoi(n);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void calcTowerOfHanoi(int n) throws IOException {
        List<int[]> lst = new ArrayList<>();

        moving(n, lst, 1, 3, 2);

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            bw.write(String.valueOf(lst.size()));
            bw.newLine();
            for ( int[] x : lst) {
                bw.write(x[0] + " " + x[1]);
                bw.newLine();
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }

    private static void moving(int remDisk, List<int[]> moves, int source, int dest, int aux) {
        if (remDisk == 1) {
            moves.add(new int[]{source, dest});
            return;
        }

        moving(remDisk - 1, moves, source, aux, dest);
        moves.add(new int[]{source, dest});
        moving(remDisk-1, moves, aux, dest, source);
    }

}
