import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int z = Integer.parseInt(br.readLine());
        
        for (int i = 0 ; i < z ; i++){
            List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            int w = list.get(0);
            int k = list.get(1);
            int maximumSquares = (w * k) / 2;

            bw.write(String.valueOf(maximumSquares));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
