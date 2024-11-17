import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int solvedProblemCount = Integer.parseInt(inputs[0]);
        int unionLevel = Integer.parseInt(inputs[1]);
        int maxLevel = Integer.parseInt(inputs[2]);

        String result;

        if (solvedProblemCount >= 1000 && (unionLevel >= 8000 || maxLevel >= 260)) {
            result = "Very Good";
        } else if (solvedProblemCount >= 1000) {
            result = "Good";
        } else {
            result = "Bad";
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
