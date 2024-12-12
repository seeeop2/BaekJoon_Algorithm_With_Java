import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int DISCOUNT_PER_ITEM = 2;

        int customerCount = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < customerCount ; i++){
            String[] input = br.readLine().split(" ");
            int purchasedItemCount = Integer.parseInt(input[0]);
            int itemPrice = Integer.parseInt(input[1]);

            int totalPrice = purchasedItemCount == 1 ?
                    itemPrice : purchasedItemCount * itemPrice - (purchasedItemCount - 1) * DISCOUNT_PER_ITEM;

            bw.write(String.format("%d %d\n", purchasedItemCount, itemPrice));
            bw.write(totalPrice + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
