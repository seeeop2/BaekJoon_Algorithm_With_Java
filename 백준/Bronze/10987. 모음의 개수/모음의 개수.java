import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        long vowelCount = input.chars()
                                .map(c -> (char) c)
                                .filter(c -> vowels.contains((char) c))
                                .count();

        bw.write(String.valueOf(vowelCount));

        bw.flush();
        br.close();
        bw.close();
    }
}
