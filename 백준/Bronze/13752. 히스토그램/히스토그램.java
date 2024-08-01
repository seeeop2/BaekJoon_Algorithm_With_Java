import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfTests = Integer.parseInt(br.readLine());
        
        for (int testIndex = 0; testIndex < numberOfTests; testIndex++) {
            int barLength = Integer.parseInt(br.readLine());
            
            for (int barIndex = 0; barIndex < barLength; barIndex++) {
                bw.write("=");
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
