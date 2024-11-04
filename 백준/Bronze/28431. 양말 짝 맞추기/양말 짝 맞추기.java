import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> sockList = new ArrayList<>();

        for (int i = 0 ; i < 5 ; i++){
            String sock = br.readLine();
            if (sockList.contains(sock)){
                sockList.remove(sock);
            } else {
                sockList.add(sock);
            }
        }
        
        bw.write(sockList.get(0));

        bw.flush();
        bw.close();
        br.close();
    }
}
