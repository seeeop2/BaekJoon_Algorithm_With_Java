import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        int[] uniqueSortedArray = Arrays.stream(br.readLine().split(" "))
                .distinct()
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        for (int number : uniqueSortedArray) {
            bw.write(number + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
