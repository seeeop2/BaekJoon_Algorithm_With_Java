import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfColors = Integer.parseInt(br.readLine());

        int numberOfTops = numberOfColors;
        int numberOfBottoms = numberOfColors - 1;
        int differentCombinations = numberOfTops * numberOfBottoms;

        bw.write(String.valueOf(differentCombinations));

        bw.flush();
        br.close();
        bw.close();
    }
}
