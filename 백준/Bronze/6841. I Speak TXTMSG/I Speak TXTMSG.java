import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String,String> shortMessageMap = new HashMap<>();
        shortMessageMap.put("CU","see you");
        shortMessageMap.put(":-)","I’m happy");
        shortMessageMap.put(":-(","I’m unhappy");
        shortMessageMap.put(";-)","wink");
        shortMessageMap.put(":-P","stick out my tongue");
        shortMessageMap.put("(~.~)","sleepy");
        shortMessageMap.put("TA","totally awesome");
        shortMessageMap.put("CCC","Canadian Computing Competition");
        shortMessageMap.put("CUZ","because");
        shortMessageMap.put("TY","thank-you");
        shortMessageMap.put("YW","you’re welcome");
        shortMessageMap.put("TTYL","talk to you later");

        while (true){
            String input = br.readLine();
            String output;

            if (shortMessageMap.containsKey(input)){
                output = shortMessageMap.get(input);
            }
            else{
                output = input;
            }

            bw.write(output);
            bw.newLine();

            if (input.equals("TTYL")){
                break;
            }
        }

        bw.flush();
        bw.close();
    }
}
