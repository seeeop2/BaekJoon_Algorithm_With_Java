import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfProblems = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfProblems; i++) {
            String[] problemDescription = br.readLine().split(" ");
            int branches = Integer.parseInt(problemDescription[0]);
            int loops = Integer.parseInt(problemDescription[1]);

            String isSimpleProblem = (branches <= 1 && loops <= 2) || (branches <= 2 && loops <= 1) ? "Yes" : "No";
            bw.write(isSimpleProblem + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
