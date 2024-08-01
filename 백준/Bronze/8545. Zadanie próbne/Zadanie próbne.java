import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<String> reversedEachAlphabet = Arrays.stream(br.readLine().split("")).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for (String str : reversedEachAlphabet) {
            bw.write(str);
        }

        bw.flush();
        bw.close();
    }
}
