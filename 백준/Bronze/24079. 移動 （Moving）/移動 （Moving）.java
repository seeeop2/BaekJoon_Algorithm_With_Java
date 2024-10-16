import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstValue = Integer.parseInt(br.readLine());
        int secondValue = Integer.parseInt(br.readLine());
        double limit = Double.parseDouble(br.readLine());

        int total = firstValue + secondValue;

        String result = total < limit + 0.5 ? "1" : "0";

        bw.write(result);

        bw.flush();
        br.close();
        bw.close();
    }
}
