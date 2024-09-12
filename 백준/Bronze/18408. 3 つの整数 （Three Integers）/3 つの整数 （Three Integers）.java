import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final String ONE = "1";
        final String TWO = "2";

        String[] inputCharacters = br.readLine().split("");
        long countOfOne = Arrays.stream(inputCharacters).filter(it -> it.equals(ONE)).count();
        long countOfTwo = Arrays.stream(inputCharacters).filter(it -> it.equals(TWO)).count();

        String result = countOfOne > countOfTwo ? ONE : TWO;

        bw.write(result);
        bw.flush();
        br.close();
        bw.close();
    }
}
