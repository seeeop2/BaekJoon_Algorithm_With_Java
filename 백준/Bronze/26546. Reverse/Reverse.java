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
            String[] inputLine = br.readLine().split(" ");
            String originalString = inputLine[0];
            int startIndex = Integer.parseInt(inputLine[1]);
            int endIndex = Integer.parseInt(inputLine[2]);

            String resultString = originalString.substring(0, startIndex) + originalString.substring(endIndex);
            bw.write(resultString);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
