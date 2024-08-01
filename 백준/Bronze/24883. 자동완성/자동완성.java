import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String alphabet = br.readLine().toUpperCase();

        if (alphabet.equals("N")){
            bw.write("Naver D2");
        } else{
            bw.write("Naver Whale");
        }

        bw.flush();
        bw.close();
    }
}
