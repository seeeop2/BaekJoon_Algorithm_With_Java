import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solve();
    }

    // 시간 복잡도: O(n)
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> pepperSpicinessMap = new HashMap<>();
        pepperSpicinessMap.put("Poblano", 1500);
        pepperSpicinessMap.put("Mirasol", 6000);
        pepperSpicinessMap.put("Serrano", 15500);
        pepperSpicinessMap.put("Cayenne", 40000);
        pepperSpicinessMap.put("Thai", 75000);
        pepperSpicinessMap.put("Habanero", 125000);

        int numberOfPeppers = Integer.parseInt(br.readLine());

        int totalSpiciness = 0;

        for (int i = 0; i < numberOfPeppers; i++) {
            String pepperName = br.readLine();
            int spiciness = pepperSpicinessMap.get(pepperName);
            totalSpiciness += spiciness;
        }

        bw.write(Integer.toString(totalSpiciness));
        bw.flush();
        bw.close();
        br.close();
    }
}
