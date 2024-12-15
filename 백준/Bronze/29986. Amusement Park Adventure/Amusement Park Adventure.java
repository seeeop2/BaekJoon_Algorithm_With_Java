import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputLine = br.readLine().split(" ");
        int height = Integer.parseInt(inputLine[1]);

        String[] rideHeightRequirements = br.readLine().split(" ");

        List<Integer> accessibleRides = Arrays.stream(rideHeightRequirements)
                .map(Integer::parseInt)
                .filter(it -> it <= height)
                .collect(Collectors.toList());

        bw.write(Integer.toString(accessibleRides.size()));

        bw.flush();
        bw.close();
        br.close();
    }
}
