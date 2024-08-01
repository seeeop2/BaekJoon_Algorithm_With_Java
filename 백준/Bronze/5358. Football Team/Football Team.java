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

            if (input == null){
                break;
            }

            List<String> alphabets = Arrays.stream(input.split("")).collect(Collectors.toList());

            for (int i = 0 ; i < alphabets.size() ; i++){
                switch (alphabets.get(i)) {
                    case "i":
                        alphabets.set(i,"e");
                        break;
                    case "I":
                        alphabets.set(i,"E");
                        break;
                    case "e":
                        alphabets.set(i,"i");
                        break;
                    case "E":
                        alphabets.set(i,"I");
                        break;
                }
            }

            bw.write(String.join("",alphabets));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
