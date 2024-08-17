import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstInput = br.readLine();
        String secondInput = br.readLine();
        String thirdInput = br.readLine();
        String fourthInput = br.readLine();

        String result = ((firstInput.equals("8") || firstInput.equals("9")) && secondInput.equals(thirdInput) && (fourthInput.equals("8") || fourthInput.equals("9"))) ? "ignore" : "answer";

        bw.write(result);

        bw.flush();
        br.close();
        bw.close();
    }
}
