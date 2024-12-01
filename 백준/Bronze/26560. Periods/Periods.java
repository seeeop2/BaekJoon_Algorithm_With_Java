import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfLines = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfLines; i++) {
            String sentence = br.readLine();

            if (!sentence.endsWith(".")) {
                sentence += ".";
            }
            bw.write(sentence + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
