import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfTransactions = Integer.parseInt(br.readLine());
        for (int i = 0; i < numberOfTransactions; i++) {
            double totalPrice = 0;
            int numberOfItems = Integer.parseInt(br.readLine());

            for (int j = 0; j < numberOfItems; j++) {
                String[] itemDetails = br.readLine().split(" ");
                int quantity = Integer.parseInt(itemDetails[1]);
                double itemPrice = Double.parseDouble(itemDetails[2]);
                totalPrice += quantity * itemPrice;
            }
            String formattedTotalPrice = String.format("%.2f", totalPrice);
            bw.write("$" + formattedTotalPrice + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
