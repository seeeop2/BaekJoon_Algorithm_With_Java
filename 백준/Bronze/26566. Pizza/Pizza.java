import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfDataSets = Integer.parseInt(br.readLine());
        for (int i = 0; i < numberOfDataSets; i++) {
            String[] sliceInput = br.readLine().split(" ");
            int sliceArea = Integer.parseInt(sliceInput[0]);
            int slicePrice = Integer.parseInt(sliceInput[1]);

            String[] wholePizzaInput = br.readLine().split(" ");
            int wholePizzaRadius = Integer.parseInt(wholePizzaInput[0]);
            int wholePizzaPrice = Integer.parseInt(wholePizzaInput[1]);
            double wholePizzaArea = Math.PI * Math.pow(wholePizzaRadius, 2);

            double sliceAreaPerDollar = (double) sliceArea / slicePrice;
            double wholePizzaAreaPerDollar = wholePizzaArea / wholePizzaPrice;

            String result = sliceAreaPerDollar > wholePizzaAreaPerDollar ? "Slice of pizza" : "Whole pizza";
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
