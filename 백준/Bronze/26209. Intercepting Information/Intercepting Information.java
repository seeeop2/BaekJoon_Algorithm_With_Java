import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long countOfNine = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).filter(it -> it == 9).count();

        if (countOfNine == 0){
            bw.write("S");
        } else{
            bw.write("F");
        }

        bw.flush();
        bw.close();
    }
}
