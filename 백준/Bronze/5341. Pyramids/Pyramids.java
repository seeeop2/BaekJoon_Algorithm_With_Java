import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int input = 0;

        while ( (input =  Integer.parseInt(br.readLine())) != 0 ) {

            int needNumberOfBlocks = 0;

            for (int i = 1 ; i <= input ; i++) {
                needNumberOfBlocks += i;
            }
            bw.write(String.valueOf( needNumberOfBlocks ));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
