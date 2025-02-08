import java.io.*;

// 시간 복잡도: O(1)
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);

        int distanceToLeft = x;
        int distanceToRight = w - x;
        int distanceToBottom = y;
        int distanceToTop = h - y;

        int minDistance = Math.min(Math.min(distanceToLeft, distanceToRight), Math.min(distanceToBottom, distanceToTop));

        bw.write(Integer.toString(minDistance));
        bw.flush();
        bw.close();
        br.close();
    }
}
