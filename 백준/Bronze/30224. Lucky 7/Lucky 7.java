import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        List<String> separateEachAlphabet = Arrays.stream(input.split("")).collect(Collectors.toList());
        int inputToInt = Integer.parseInt(input);

        if (!separateEachAlphabet.contains("7")){
            if (inputToInt % 7 != 0){
                bw.write("0");
            }
            else{
                bw.write("1");
            }
        }
        else{
            if (inputToInt % 7 != 0){
                bw.write("2");
            }
            else{
                bw.write("3");
            }
        }

        bw.flush();
        bw.close();
    }
}
