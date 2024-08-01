import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            String input = br.readLine();

            if (input.equals("END")) {
                break;
            }

            List<String> inputList = Arrays.stream(input.split("")).collect(Collectors.toList());
            List<String> reversedList = new ArrayList<>();
            
            for (int i = inputList.size(); i > 0; i--) {
                reversedList.add(inputList.get(i - 1));
            }
            
            inputList = reversedList;

            for (String s : inputList) {
                bw.write(s);
            }
            
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
