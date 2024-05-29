import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            String input = br.readLine();
            
            if (input.equals("# 0 0")){
                break;
            }
            
            List<String> inputList = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String name = inputList.get(0);
            int age = Integer.parseInt(inputList.get(1));
            int weight = Integer.parseInt(inputList.get(2));
            String sortingMember = "";

            if (age > 17 || weight >= 80){
                sortingMember = "Senior";
            }
            else{
                sortingMember = "Junior";
            }

            bw.write(name + " " + sortingMember + "\n");
        }

        bw.flush();
        bw.close();
    }
}
