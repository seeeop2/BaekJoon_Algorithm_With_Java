import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> numbers = Arrays.stream(br.readLine().split(" "))
                                      .map(Integer::parseInt)
                                      .sorted()
                                      .collect(Collectors.toList());
        int secondLargest = numbers.get(1);
        
        bw.write(secondLargest + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
