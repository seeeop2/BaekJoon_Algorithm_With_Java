import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputData = br.readLine().split(" ");
        int requiredPencils = Integer.parseInt(inputData[0]);
        int pencilsInSetA = Integer.parseInt(inputData[1]);
        int priceOfSetA = Integer.parseInt(inputData[2]);
        int pencilsInSetB = Integer.parseInt(inputData[3]);
        int priceOfSetB = Integer.parseInt(inputData[4]);

        int numberOfSetsToBuyA = requiredPencils % pencilsInSetA == 0 ? requiredPencils / pencilsInSetA : requiredPencils / pencilsInSetA + 1;
        int numberOfSetsToBuyB = requiredPencils % pencilsInSetB == 0 ? requiredPencils / pencilsInSetB : requiredPencils / pencilsInSetB + 1;

        int totalCostA = numberOfSetsToBuyA * priceOfSetA;
        int totalCostB = numberOfSetsToBuyB * priceOfSetB;

        int minPrice= Math.min(totalCostA, totalCostB);

        bw.write(String.valueOf(minPrice));

        bw.flush();
        br.close();
        bw.close();
    }
}
