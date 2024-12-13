import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int giftIconCount = Integer.parseInt(br.readLine());
        int usableGifticonCount = 0;

        for (int i = 0; i < giftIconCount; i++) {
            String input = br.readLine();
            int remainingDays = Integer.parseInt(input.substring(2));

            if (remainingDays <= 90) {
                usableGifticonCount++;
            }
        }
        bw.write(Integer.toString(usableGifticonCount));

        bw.flush();
        bw.close();
        br.close();
    }
}
