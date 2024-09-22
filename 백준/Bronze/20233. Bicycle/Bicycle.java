import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int FREE_TIME_COMPANY_A = 30;
        final int FREE_TIME_COMPANY_B = 45;
        final int WORKING_DAYS_IN_OCTOBER = 21;

        int baseCostA = Integer.parseInt(br.readLine());
        int additionalCostA = Integer.parseInt(br.readLine());
        int baseCostB = Integer.parseInt(br.readLine());
        int additionalCostB = Integer.parseInt(br.readLine());
        int rentalDuration = Integer.parseInt(br.readLine());

        int totalCostA = baseCostA + Math.max(0, (rentalDuration - FREE_TIME_COMPANY_A) * additionalCostA * WORKING_DAYS_IN_OCTOBER);
        int totalCostB = baseCostB + Math.max(0, (rentalDuration - FREE_TIME_COMPANY_B) * additionalCostB * WORKING_DAYS_IN_OCTOBER);

        bw.write(totalCostA + " " + totalCostB);

        bw.flush();
        br.close();
        bw.close();
    }
}
