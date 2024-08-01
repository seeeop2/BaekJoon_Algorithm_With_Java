import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lastNumberOfDate = Integer.parseInt(br.readLine());
        List<Integer> lastDigitsOfCarsLicensePlates = Arrays.stream(br.readLine()
                                                            .split(" "))
                                                            .map(Integer::parseInt)
                                                            .collect(Collectors.toList());

        long count = lastDigitsOfCarsLicensePlates.stream()
                                                    .filter(it -> it == lastNumberOfDate)
                                                    .count();
        bw.write(String.valueOf(count));

        bw.flush();
        br.close();
        bw.close();
    }
}
