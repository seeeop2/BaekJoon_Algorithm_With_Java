import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final String ZACK_JERSEY_NUMBER = "17";
        final String MACK_JERSEY_NUMBER = "18";

        int numberOfDataSets = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfDataSets; i++) {
            String inputJerseyNumbers = br.readLine();
            String[] jerseyNumbersArray = inputJerseyNumbers.split(" ");

            boolean isZackPresent = false;
            boolean isMackPresent = false;

            for (String jerseyNumber : jerseyNumbersArray) {
                if (jerseyNumber.equals(ZACK_JERSEY_NUMBER)) {
                    isZackPresent = true;
                } else if (jerseyNumber.equals(MACK_JERSEY_NUMBER)) {
                    isMackPresent = true;
                }
            }

            String resultMessage = isZackPresent && isMackPresent
                    ? "both" : isZackPresent
                    ? "zack" : isMackPresent
                    ? "mack" : "none";

            bw.write(inputJerseyNumbers + "\n");
            bw.write(resultMessage + "\n\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
