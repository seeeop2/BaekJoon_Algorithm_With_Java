import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int BASE = 100;

        String[] inputs = br.readLine().split(" ");
        int scoreA = Integer.parseInt(inputs[0]);
        int scoreB = Integer.parseInt(inputs[1]);

        int diffA = BASE - scoreA;
        int diffB = BASE - scoreB;
        int c = BASE - (diffA + diffB);
        int d = diffA * diffB;
        int hundreds = d / 100;
        int units = d % 100;

        String combination = diffA + " " + diffB + " " + c + " " + d + " " +  hundreds + " " + units;
        bw.write(combination + "\n");

        if (hundreds != 0) {
            c += hundreds;
        }
        
        bw.write(c + " " + units);
        bw.flush();
        bw.close();
        br.close();
    }
}
