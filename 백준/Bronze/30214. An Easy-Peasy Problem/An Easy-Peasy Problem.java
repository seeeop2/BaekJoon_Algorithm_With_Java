import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Double> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Double.parseDouble(it)).collect(Collectors.toList());
        double s1 = inputList.get(0);
        double s2 = inputList.get(1);

        if (s1 >= s2/2){
            bw.write("E");
        }
        else{
            bw.write("H");
        }

        bw.flush();
        bw.close();
    }
}
