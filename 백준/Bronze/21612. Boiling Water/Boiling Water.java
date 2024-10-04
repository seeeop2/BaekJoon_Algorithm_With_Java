import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int STANDARD_VALUE = 100;

        int inputTemperature = Integer.parseInt(br.readLine());
        int calculatedValue = calculateTemperature(inputTemperature);

        int comparisonResult = Integer.compare(STANDARD_VALUE, calculatedValue);

        bw.write(calculatedValue + "\n");
        bw.write(comparisonResult + "\n");

        bw.flush();
        br.close();
        bw.close();
    }

    public static int calculateTemperature(int temperature) {
        return 5 * temperature - 400;
    }
}
