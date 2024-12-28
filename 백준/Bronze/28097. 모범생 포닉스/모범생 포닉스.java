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
        
        int numberOfPlans = Integer.parseInt(br.readLine());
        List<Integer> studyTimes = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int totalStudyTime = 0;
        
        for (int studyTime : studyTimes) {
            totalStudyTime += studyTime;
        }
        
        int totalRestTime = 8 * (numberOfPlans - 1);
        int totalTime = totalStudyTime + totalRestTime;

        int days = totalTime / 24;
        int hours = totalTime % 24;

        bw.write(String.format("%d %d", days, hours));

        bw.flush();
        bw.close();
        br.close();
    }
}