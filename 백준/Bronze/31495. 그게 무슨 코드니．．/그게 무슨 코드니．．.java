import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputString = br.readLine();

        if (inputString.length() >= 2 && inputString.startsWith("\"") && inputString.endsWith("\"")) {
            String innerString = inputString.substring(1, inputString.length() - 1);
            if (innerString.isEmpty()) {
                bw.write("CE");
            } else {
                bw.write(innerString);
            }
        } else {
            bw.write("CE");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
