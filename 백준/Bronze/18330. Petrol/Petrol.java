import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int predictedUsage = Integer.parseInt(br.readLine());
        int remainingQuota = Integer.parseInt(br.readLine());

        final int MONTHLY_QUOTA = 60;
        final int PRICE_WITHIN_QUOTA = 1500;
        final int PRICE_OVER_QUOTA = 3000;

        int totalAvailableQuota = remainingQuota + MONTHLY_QUOTA;
        int totalCost;

        if (predictedUsage <= totalAvailableQuota) {
            totalCost = predictedUsage * PRICE_WITHIN_QUOTA;
        } else {
            totalCost = totalAvailableQuota * PRICE_WITHIN_QUOTA + (predictedUsage - totalAvailableQuota) * PRICE_OVER_QUOTA;
        }

        bw.write(String.valueOf(totalCost));

        bw.flush();
        br.close();
        bw.close();
    }
}
