import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstInput = br.readLine();
        String secondInput = br.readLine();
        String thirdInput = br.readLine();

        int result1 = Integer.parseInt(firstInput) + Integer.parseInt(secondInput) - Integer.parseInt(thirdInput);
        int result2 = Integer.parseInt(firstInput + secondInput) - Integer.parseInt(thirdInput);

        bw.write(result1 + "\n");
        bw.write(result2 + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
