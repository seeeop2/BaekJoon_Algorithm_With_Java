import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> scores1 = new ArrayList<>();
        List<Integer> scores2 = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 6; i++) {
            if (i<4){
                scores1.add(Integer.parseInt(br.readLine()));
            } else{
                scores2.add(Integer.parseInt(br.readLine()));
            }
        }

        scores1.sort(Comparator.reverseOrder());
        scores2.sort(Comparator.reverseOrder());

        for (int i = 0; i < scores1.size() - 1 ; i++) {
            sum += scores1.get(i);
        }

        sum += scores2.get(0);

        bw.write(String.valueOf(sum));

        bw.flush();
        br.close();
        bw.close();
    }
}
