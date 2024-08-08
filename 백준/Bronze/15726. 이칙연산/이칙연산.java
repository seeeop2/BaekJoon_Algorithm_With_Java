import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputValues = br.readLine().split(" ");
        double firstValue = Double.parseDouble(inputValues[0]);
        double secondValue = Double.parseDouble(inputValues[1]);
        double thirdValue = Double.parseDouble(inputValues[2]);

        int result = (int) (firstValue * Math.max(secondValue,thirdValue) / Math.min(secondValue,thirdValue));

        bw.write(String.valueOf(result));

        bw.flush();
        br.close();
        bw.close();
    }
}
