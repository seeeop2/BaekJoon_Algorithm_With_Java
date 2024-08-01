import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String sentence = "gum gum for jay jay";
        String input;
        int count = 0;

        while ((input = br.readLine()) != null){
            if(input.equals(sentence)){
                count++;
            }
        }
        
        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
    }
}
