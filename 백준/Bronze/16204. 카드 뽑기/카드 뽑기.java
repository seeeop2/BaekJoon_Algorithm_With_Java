import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputValues = br.readLine().split(" ");
        int totalCards = Integer.parseInt(inputValues[0]);
        int frontO = Integer.parseInt(inputValues[1]);
        int backO = Integer.parseInt(inputValues[2]);

        int maxO = Math.min(frontO, backO);
        int maxX = Math.min(totalCards - frontO, totalCards - backO);
        int maxSame = maxO + maxX;

        bw.write(String.valueOf(maxSame));

        bw.flush();
        br.close();
        bw.close();
    }
}
