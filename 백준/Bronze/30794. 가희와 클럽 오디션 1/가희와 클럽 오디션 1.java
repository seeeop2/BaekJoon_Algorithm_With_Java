import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("miss", 0);
        scoreMap.put("bad", 200);
        scoreMap.put("cool", 400);
        scoreMap.put("great", 600);
        scoreMap.put("perfect", 1000);

        String[] input = br.readLine().split(" ");
        int level = Integer.parseInt(input[0]);
        String judgment = input[1];
        int score = scoreMap.get(judgment) * level;

        bw.write(Integer.toString(score));
        bw.flush();
        bw.close();
        br.close();
    }
}
