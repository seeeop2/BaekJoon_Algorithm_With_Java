import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solve();
    }

    // 시간 복잡도: O(n)
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfDataSets = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfDataSets; i++) {
            List<Double> values = Arrays.stream(br.readLine().split(" "))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());
            double firstValue = values.get(0);
            double secondValue = values.get(1);
            double absoluteDifference = Math.abs(firstValue - secondValue);
            String formattedDifference = String.format("%.1f", absoluteDifference);

            bw.write(formattedDifference + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
