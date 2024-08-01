import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            Integer boys = inputList.get(0);
            Integer girls = inputList.get(1);

            if (boys.equals(0) && girls.equals(0)){
                break;
            }

            int total = boys + girls;
            bw.write(String.valueOf(total) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
