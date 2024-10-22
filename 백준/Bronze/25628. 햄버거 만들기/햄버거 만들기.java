import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputValues = br.readLine().split(" ");
        int bunCount = Integer.parseInt(inputValues[0]);
        int pattyCount = Integer.parseInt(inputValues[1]);

        int maxBurgers = Math.min(bunCount / 2, pattyCount);

        bw.write(String.valueOf(maxBurgers));
        
        bw.flush();
        br.close();
        bw.close();
    }
}
