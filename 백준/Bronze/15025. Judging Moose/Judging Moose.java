import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] hornCounts = br.readLine().split(" ");
        int leftHornCount = Integer.parseInt(hornCounts[0]);
        int rightHornCount = Integer.parseInt(hornCounts[1]);

        String resultMessage;
        int maximumHornCount = Math.max(leftHornCount, rightHornCount);

        if (maximumHornCount == 0) {
            resultMessage = "Not a moose";
        } else {
            resultMessage = (leftHornCount == rightHornCount) ? "Even " : "Odd ";
            resultMessage += maximumHornCount * 2;
        }

        bw.write(resultMessage);
        bw.flush();
        br.close();
        bw.close();
    }
}
