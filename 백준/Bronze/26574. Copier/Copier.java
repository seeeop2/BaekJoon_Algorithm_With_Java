import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < loop ; i++){
            int input = Integer.parseInt(br.readLine());
            bw.write(input + " " + input);

            if (i == loop -1){
                break;
            }
            else {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
