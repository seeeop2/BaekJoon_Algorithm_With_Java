import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < n ; i++){
            List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
            int x = inputList.get(0);
            int y = inputList.get(1);

            if (x >= y){
                bw.write("MMM BRAINS\n");
            }
            else {
                bw.write("NO BRAINS\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
