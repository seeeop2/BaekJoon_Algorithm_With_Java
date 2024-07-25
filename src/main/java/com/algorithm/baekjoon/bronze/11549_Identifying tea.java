import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int targetTeaType = Integer.parseInt(br.readLine());
        List<Integer> teaGuesses  = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        long correctAnswer = teaGuesses .stream().filter(it -> it == targetTeaType).count();

        bw.write(String.valueOf(correctAnswer));
        
        bw.flush();
        br.close();
        bw.close();
    }
}
