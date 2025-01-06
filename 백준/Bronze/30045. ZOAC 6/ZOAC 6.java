import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfSentences = Integer.parseInt(br.readLine());
        int emoticonCount = 0;

        for (int i = 0; i < numberOfSentences; i++) {
            String sentence = br.readLine();
            if (sentence.contains("01") || sentence.contains("OI")) {
                emoticonCount++;
            }
        }

        bw.write(Integer.toString(emoticonCount));
        bw.flush();
        bw.close();
        br.close();
    }
}

