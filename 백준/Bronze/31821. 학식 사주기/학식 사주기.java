import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> menuPrices = new ArrayList<>();
        int totalAmount = 0;

        int menuCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < menuCount; i++) {
            menuPrices.add(Integer.parseInt(br.readLine()));
        }

        int studentCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < studentCount; i++) {
            int cornerNumber = Integer.parseInt(br.readLine());
            totalAmount += menuPrices.get(cornerNumber - 1);
        }

        bw.write(totalAmount + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
