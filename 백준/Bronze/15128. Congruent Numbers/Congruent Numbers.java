import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        double p1 = Double.parseDouble(input[0]);
        double q1 = Double.parseDouble(input[1]);
        double p2 = Double.parseDouble(input[2]);
        double q2 = Double.parseDouble(input[3]);
        
        double area = p1 / q1 * p2 / q2 / 2 ;

        String result = area % 1 == 0 ? "1" : "0";

        bw.write(result);

        bw.flush();
        br.close();
        bw.close();
    }
}
