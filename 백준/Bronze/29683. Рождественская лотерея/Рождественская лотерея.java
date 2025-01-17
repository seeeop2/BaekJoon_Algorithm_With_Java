import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputValues = br.readLine().split(" ");
        int numberOfReceipts = Integer.parseInt(inputValues[0]);
        int amountRequiredForTicket = Integer.parseInt(inputValues[1]);

        int totalTickets = 0;

        int[] purchaseAmounts = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numberOfReceipts; i++) {
            int currentReceiptAmount = purchaseAmounts[i];
            totalTickets += currentReceiptAmount / amountRequiredForTicket;
        }

        bw.write(Integer.toString(totalTickets));
        bw.flush();
        bw.close();
        br.close();
    }
}
