import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sliceInput = br.readLine().split(" ");
        int sliceArea = Integer.parseInt(sliceInput[0]);
        int slicePrice = Integer.parseInt(sliceInput[1]);

        String[] wholeInput = br.readLine().split(" ");
        int wholeRadius = Integer.parseInt(wholeInput[0]);
        int wholePrice = Integer.parseInt(wholeInput[1]);

        double sliceAreaPerDollar = (double) sliceArea / slicePrice;

        double wholeArea = Math.PI * wholeRadius * wholeRadius;
        double wholeAreaPerDollar = wholeArea / wholePrice;

        if (sliceAreaPerDollar > wholeAreaPerDollar) {
            bw.write("Slice of pizza");
        } else {
            bw.write("Whole pizza");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
