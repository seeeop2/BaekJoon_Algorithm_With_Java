import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int card1 = Integer.parseInt(inputs[0]);
        int card2 = Integer.parseInt(inputs[1]);
        int result = Math.max(card1, card2);

        bw.write(String.valueOf(result));
        
        bw.flush();
        br.close();
        bw.close();
    }
}
