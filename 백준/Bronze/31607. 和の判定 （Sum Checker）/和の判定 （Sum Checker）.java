import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputA = br.readLine();
        String inputB = br.readLine();
        String inputC = br.readLine();

        List<Integer> numbers = Stream.of(inputA, inputB, inputC)
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int result = numbers.get(0) == numbers.get(1) + numbers.get(2) ? 1 : 0;

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
