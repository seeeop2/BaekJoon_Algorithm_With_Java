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

        int studyDays = Integer.parseInt(br.readLine());
        List<Integer> plannedPages = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> actualPages = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int successfulDays = 0;

        for (int i = 0; i < studyDays; i++) {
            if (actualPages.get(i) >= plannedPages.get(i)) {
                successfulDays++;
            }
        }

        bw.write(Integer.toString(successfulDays));
        bw.flush();
        bw.close();
        br.close();
    }
}
