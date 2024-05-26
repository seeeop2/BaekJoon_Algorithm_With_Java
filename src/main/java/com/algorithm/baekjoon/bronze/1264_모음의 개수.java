import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> vowelList = Arrays.asList("a", "e", "i", "o", "u");
        String sentence = "";

        while (!((sentence = br.readLine().toLowerCase()).equals("#"))){
            int result = 0;

            List<String> alphabetList = Arrays.stream(sentence.split("")).collect(Collectors.toList());

            for(String str : alphabetList){
                boolean checkAlphabet = vowelList.contains(str);

                if(checkAlphabet){
                    result++;
                }
            }

            bw.write(String.valueOf(result));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
