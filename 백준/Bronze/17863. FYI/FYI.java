import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputString = br.readLine();
        String firstThreeChars = inputString.length() >= 3 ? inputString.substring(0, 3) : "";

        String result = firstThreeChars.equals("555") ? "YES" : "NO";

        bw.write(result);
        
        bw.flush();
        br.close();
        bw.close();
    }
}
