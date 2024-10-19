import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int BASE_PRICE = 250;
        final int ADDITIONAL_PRICE = 100;

        int desiredHeight = Integer.parseInt(br.readLine());
        int baseHeight = Integer.parseInt(br.readLine());
        int additionalHeight = Integer.parseInt(br.readLine());

        if (baseHeight >= desiredHeight) {
            bw.write(String.valueOf(BASE_PRICE));
        } else {
            int heightDifference = desiredHeight - baseHeight;
            int unitsNeeded = (int) Math.ceil((double) heightDifference / additionalHeight);

            int totalCost = BASE_PRICE + (unitsNeeded * ADDITIONAL_PRICE);
            bw.write(String.valueOf(totalCost));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
