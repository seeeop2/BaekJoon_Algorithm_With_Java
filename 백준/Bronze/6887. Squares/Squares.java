import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double input = Double.parseDouble(br.readLine());
        int numberOfSquares = (int) Math.sqrt(input);

        bw.write("The largest square has side length " + numberOfSquares + ".");

        bw.flush();
        bw.close();
    }
}
