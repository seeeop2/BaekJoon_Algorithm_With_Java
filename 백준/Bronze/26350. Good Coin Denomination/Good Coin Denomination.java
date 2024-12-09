import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n^2)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            int count = list.get(0);
            list = list.subList(1, count + 1);

            boolean isGood = true;
            for (int j = 0 ; j < list.size() - 1 ; j++){
                if (list.get(j + 1) < (list.get(j) * 2)){
                    isGood = false;
                    break;
                }
            }

            String denominations = list.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" "));
            bw.write("Denominations: " + denominations + "\n");

            if (isGood) {
                bw.write("Good coin denominations!\n");
            } else {
                bw.write("Bad coin denominations!\n");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
