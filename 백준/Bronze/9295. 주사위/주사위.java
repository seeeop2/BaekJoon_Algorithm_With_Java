import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseCount  = Integer.parseInt(br.readLine());
        
        for (int i = 1 ; i <= testCaseCount  ; i++){
            List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            int dice1 = list.get(0);
            int dice2 = list.get(1);
            int additionOfDice = dice1 + dice2;

            bw.write("Case "+ i + ": " + additionOfDice);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
