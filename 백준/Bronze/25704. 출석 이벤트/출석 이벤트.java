import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int attendanceStamps = Integer.parseInt(br.readLine());
        int productPrice = Integer.parseInt(br.readLine());

        int minPayment = productPrice;

        if (attendanceStamps >= 20) {
            minPayment = Math.min(minPayment, (int)(productPrice * 0.75));
        }
        if (attendanceStamps >= 15) {
            minPayment = Math.min(minPayment, productPrice - 2000);
        }
        if (attendanceStamps >= 10) {
            minPayment = Math.min(minPayment, (int)(productPrice * 0.9));
        }
        if (attendanceStamps >= 5) {
            minPayment = Math.min(minPayment, productPrice - 500);
        }

        minPayment = Math.max(minPayment, 0);
        bw.write(String.valueOf(minPayment));
        bw.flush();
        br.close();
        bw.close();
    }
}
