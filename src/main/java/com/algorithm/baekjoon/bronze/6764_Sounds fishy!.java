import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> inputList = new ArrayList<>();

        for (int i = 0 ; i < 4 ; i++){
            inputList.add(Integer.parseInt(br.readLine()));
        }

        if (inputList.get(0) > inputList.get(1) && inputList.get(1) > inputList.get(2) && inputList.get(2) > inputList.get(3)){
            bw.write("Fish Diving");
        }
        else if (inputList.get(0) < inputList.get(1) && inputList.get(1) < inputList.get(2) && inputList.get(2) < inputList.get(3)) {
            bw.write("Fish Rising");
        }
        else if(inputList.get(0).equals(inputList.get(1)) && inputList.get(1).equals(inputList.get(2)) && inputList.get(2).equals(inputList.get(3))) {
            bw.write("Fish At Constant Depth");
        }
        else{
            bw.write("No Fish");
        }

        bw.flush();
        bw.close();
    }
}
