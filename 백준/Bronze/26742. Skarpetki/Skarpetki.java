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

        List<String> sockList = Arrays.stream(br.readLine().split("")).collect(Collectors.toList());
        long countWhite = sockList.stream().filter(sock -> sock.equals("B")).count() / 2;
        long countBlack = sockList.stream().filter(sock -> sock.equals("C")).count() / 2;

        long totalPairs = countWhite + countBlack;

        bw.write(Long.toString(totalPairs));

        bw.flush();
        bw.close();
        br.close();
    }
}
