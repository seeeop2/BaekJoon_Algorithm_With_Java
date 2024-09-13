import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> sortedNumbers = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int sumOfTwoLargest = sortedNumbers.get(0) + sortedNumbers.get(1);

        bw.write(String.valueOf(sumOfTwoLargest));

        bw.flush();
        br.close();
        bw.close();
    }
}
