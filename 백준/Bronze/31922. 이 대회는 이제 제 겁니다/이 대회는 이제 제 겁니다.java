import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int prizeDivision1 = Integer.parseInt(input[0]);
        int prizeDivision2 = Integer.parseInt(input[1]);
        int prizeShake = Integer.parseInt(input[2]);

        int maxPrize = Math.max(prizeDivision1 + prizeShake, prizeDivision2);

        bw.write(String.valueOf(maxPrize));
        bw.flush();
        bw.close();
        br.close();
    }
}
