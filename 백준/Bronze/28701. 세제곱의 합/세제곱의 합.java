import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int output1 = 0;
        int output2 = 0;
        int output3 = 0;

        int n = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= n ; i++){
            output1 += i;
        }

        output2 = (int) Math.pow(output1,2);

        for(int i = 1 ; i <= n ; i++){
            output3 += (int) Math.pow(i, 3);
        }

        bw.write(output1 +"\n");
        bw.write(output2 +"\n");
        bw.write(output3 +"\n");

        bw.flush();
        bw.close();
    }
}
