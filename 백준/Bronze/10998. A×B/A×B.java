import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<Integer> input = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        int firstInt = input.get(0);
        int secondInt = input.get(1);

        int multiplication = firstInt * secondInt;
        String multiplicationToString = String.valueOf(multiplication);

        bw.write(multiplicationToString);
        bw.flush();
        bw.close();
    }
}
