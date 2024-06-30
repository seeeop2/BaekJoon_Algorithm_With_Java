import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>(Arrays.asList(9, 7, 8, 0, 9, 2, 1, 4, 1, 8));
        int sum = 0;
        
        for (int i = 0; i < 3; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0){
                sum += list.get(i);

            }
            else {
                sum += list.get(i) * 3;
            }
        }
        bw.write("The 1-3-sum is " + sum);

        bw.flush();
        bw.close();
    }
}
