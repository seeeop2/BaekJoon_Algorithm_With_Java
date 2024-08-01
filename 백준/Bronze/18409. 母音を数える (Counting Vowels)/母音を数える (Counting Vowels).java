import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        List<String> vowels = Arrays.asList("a","i","u","e","o");
        int numberOfVowels = 0;

        int numberOfLetters = Integer.parseInt(br.readLine());
        List<String> letterList = Arrays.stream(br.readLine().split("")).collect(Collectors.toList());

        for (int i = 0 ; i < numberOfLetters ; i++){
            String letter = letterList.get(i);

            for (String str : vowels){
                if (letter.equals(str)){
                    numberOfVowels++;
                    break;
                }
            }
        }
        
        bw.write(String.valueOf(numberOfVowels));
        
        bw.flush();
        bw.close();
    }
}
