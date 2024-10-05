import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int BASE_FEE = 25;
        
        int transferAmount = Integer.parseInt(br.readLine());
        double commission = BASE_FEE + (transferAmount * 0.01);
        
        if (commission < 100) {
            commission = 100;
        } else if (commission > 2000) {
            commission = 2000;
        }
        
        String formattedCommission = String.format("%.2f", commission);
        bw.write(formattedCommission + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
