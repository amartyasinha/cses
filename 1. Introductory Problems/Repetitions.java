import java.util.Scanner;

public class Repetitions {
    public static int RepetitionsFunc(String dna){
        int curr = 1;
        int result = 1;
        for (int i = 1; i < dna.length(); i++){
            if (dna.charAt(i) == dna.charAt(i-1)){
                curr++;
            }
            else {
                curr = 1;
            }
            result = Math.max(curr, result);
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
//            System.out.println("Enter DNA string (can consist only A C G T): ");
            String dna = scanner.nextLine();

            System.out.println(RepetitionsFunc(dna));
        }
    }
}
