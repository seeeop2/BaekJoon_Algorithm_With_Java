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
            List<String> inputList = Arrays.stream(br.readLine().split("")).collect(Collectors.toList());
            int inputListSize = inputList.size();

            for (int j = 0 ; j < inputListSize - 1 ; j++){

                if (inputList.get(j).equals(inputList.get(j + 1))){
                    inputList.remove(j);
                    j--;
                    inputListSize--;
                }

            }

            bw.write(String.join("",inputList));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
