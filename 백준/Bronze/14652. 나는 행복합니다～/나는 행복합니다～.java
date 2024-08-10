import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputValues = br.readLine().split(" ");
        int numRows = Integer.parseInt(inputValues[0]);
        int numCols = Integer.parseInt(inputValues[1]);
        int seatNumber = Integer.parseInt(inputValues[2]);

        int row = seatNumber / numCols;
        int col = seatNumber % numCols;

        bw.write(row + " " + col);

        bw.flush();
        br.close();
        bw.close();
    }
}
