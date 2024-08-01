import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> inputList = Arrays.stream(br.readLine().split(" ")).map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        int a = inputList.get(0);
        int b = inputList.get(1);
        int c = inputList.get(2);

        boolean checkAddition = a + b == c;

        if (checkAddition){
            bw.write("correct!");
        }
        else {
            bw.write("wrong!");
        }

        bw.flush();
        bw.close();

    }
}
