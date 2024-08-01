import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int totalScore = 0;

        for(int i = 0 ; i < 5 ; i++){
            int score = Integer.parseInt( br.readLine() );
            totalScore += score;
        }
        bw.write( String.valueOf(totalScore) );

        bw.flush();
        bw.close();
    }
}
