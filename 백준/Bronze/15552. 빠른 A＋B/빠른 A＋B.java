import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        List list = new ArrayList();

        for(int i = 0 ; i < T ; i++){
            String[] STR = br.readLine().split(" ");
            int a = Integer.parseInt(STR[0]);
            int b = Integer.parseInt(STR[1]);
            list.add(a+b);
        }
        
        for(int j = 0 ; j < list.size() ; j++){
            bw.write(list.get(j).toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}