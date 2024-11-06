import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> currencyMap = new HashMap<>();
        currencyMap.put(136, 1000);
        currencyMap.put(142, 5000);
        currencyMap.put(148, 10000);
        currencyMap.put(154, 50000);

        int n = Integer.parseInt(br.readLine());
        int totalAmount = 0;

        for (int i = 0; i < n; i++) {
            String[] dimensions = br.readLine().split(" ");
            int width = Integer.parseInt(dimensions[0]);
            int height = Integer.parseInt(dimensions[1]);

            totalAmount += currencyMap.get(width);
        }

        bw.write(totalAmount + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
