import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String,String> chant = new HashMap<>();
        chant.put("SONGDO","HIGHSCHOOL");
        chant.put("CODE","MASTER");
        chant.put("2023","0611");
        chant.put("ALGORITHM","CONTEST");

        String input = br.readLine();
        String output = chant.get(input);

        bw.write(output);

        bw.flush();
        bw.close();
    }
}
