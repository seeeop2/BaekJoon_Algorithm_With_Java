import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        boolean checkTuesday = x % 7 == 2;

        if(checkTuesday){
            bw.write("1");
        }
        else{
            bw.write("0");
        }

        bw.flush();
        bw.close();
    }
}
