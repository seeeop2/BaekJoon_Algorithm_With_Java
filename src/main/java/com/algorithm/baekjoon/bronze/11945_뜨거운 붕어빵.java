import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int numTestCases = Integer.parseInt(input[0]);
        int lineLength = Integer.parseInt(input[1]);

        for (int i = 0 ; i < numTestCases ; i++) {
            String[] split = br.readLine().split("");
            
            for (int j = lineLength - 1 ; j >= 0 ; j-- ){
                bw.write(split[j]);
            }
            bw.newLine();
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}
