import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String,String> seminarList = new HashMap<>();
        seminarList.put("Algorithm","204");
        seminarList.put("DataAnalysis","207");
        seminarList.put("ArtificialIntelligence","302");
        seminarList.put("CyberSecurity","B101");
        seminarList.put("Network","303");
        seminarList.put("Startup","501");
        seminarList.put("TestStrategy","105");

        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0 ; i < n ; i++) {
            String seminar = br.readLine();
            String classNumber = seminarList.get(seminar);
            
            bw.write(classNumber);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
