import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int firstNumber = Integer.parseInt(inputs[0]);
        int secondNumber = Integer.parseInt(inputs[1]);
        
        int smallerNumber = Math.min(firstNumber, secondNumber);
        int numberOfPairs = smallerNumber / 2;

        bw.write(numberOfPairs + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
