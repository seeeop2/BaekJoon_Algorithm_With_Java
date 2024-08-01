import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int[] intArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] defaultNumber = {1, 1, 2, 2, 2, 8};

        for(int i = 0 ; i < defaultNumber.length ; i++){
            bw.write(String.valueOf(defaultNumber[i] - intArr[i]));
            bw.write(" ");
        }

        bw.flush();
        bw.close();
    }
}
