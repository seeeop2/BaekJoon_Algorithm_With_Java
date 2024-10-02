import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int applePrice = 7;
        int pearPrice = 13;

        String[] input = br.readLine().split(" ");
        int appleCount = Integer.parseInt(input[0]);
        int pearCount = Integer.parseInt(input[1]);

        int totalApplePrice = applePrice * appleCount;
        int totalPearPrice = pearPrice * pearCount;

        String result = (totalApplePrice > totalPearPrice) ? "Axel" :  (totalApplePrice < totalPearPrice) ? "Petra" : "lika";

        bw.write(result);
        
        bw.flush();
        br.close();
        bw.close();
    }
}
