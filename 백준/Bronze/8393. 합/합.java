import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int input = Integer.parseInt(br.readLine());
        int output = 0;
      
        for (int i = 0 ; i <= input ; i++){
            output += i;
        }

        bw.write(String.valueOf(output));
      
        bw.flush();
        bw.close();
    }
}
