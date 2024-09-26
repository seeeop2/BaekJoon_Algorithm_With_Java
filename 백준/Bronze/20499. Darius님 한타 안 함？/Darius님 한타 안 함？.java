import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputParts = br.readLine().split("/");
        int kills = Integer.parseInt(inputParts[0]);
        int deaths = Integer.parseInt(inputParts[1]);
        int assists = Integer.parseInt(inputParts[2]);

        String result = (kills + assists < deaths || deaths == 0) ? "hasu" : "gosu";

        bw.write(result);
        
        bw.flush();
        br.close();
        bw.close();
    }
}
