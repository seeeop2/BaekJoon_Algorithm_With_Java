import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> inputList = new ArrayList<>();
        int totalInputs = Integer.parseInt(br.readLine());

        for (int i = 0; i < totalInputs; i++) {
            String userInput = br.readLine();
            inputList.add(userInput);
        }

        int randomIndex = (int) (Math.random() * inputList.size());

        List<String> wordsList = Arrays.stream(inputList.get(randomIndex).split(" "))
                .collect(Collectors.toList());
        
        bw.write(wordsList.get(0) + "\n");
        
        wordsList.remove(0);
        Collections.shuffle(wordsList);

        for (String word : wordsList) {
            bw.write(word);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
