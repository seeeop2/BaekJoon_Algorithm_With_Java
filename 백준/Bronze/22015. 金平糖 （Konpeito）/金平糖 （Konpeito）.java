import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> numbers = Arrays.stream(br.readLine().split(" "))
                                      .map(Integer::parseInt)
                                      .sorted(Comparator.reverseOrder())
                                      .collect(Collectors.toList());

        int largest = numbers.get(0);
        int secondLargest = numbers.get(1);
        int thirdLargest = numbers.get(2);

        int totalDifference = (largest - secondLargest) + (largest - thirdLargest);

        bw.write(String.valueOf(totalDifference));

        bw.flush();
        br.close();
        bw.close();
    }
}
