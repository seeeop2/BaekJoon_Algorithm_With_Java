import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(br.readLine());

        bw.write("Gnomes:\n");

        for (int i = 0 ; i < n ; i++){
            List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
            Integer input1 = inputList.get(0);
            Integer input2 = inputList.get(1);
            Integer input3 = inputList.get(2);

            if ((input1 >= input2 && input2 >= input3) ||(input3 >= input2 && input2 >=input1) ){
                bw.write("Ordered\n");
            } else{
                bw.write("Unordered\n");
            }

        }

        bw.flush();
        bw.close();
    }
}
