import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String one = "I";
        String five = "V";

        int input = Integer.parseInt(br.readLine());
        int needOne = input % 5;
        int needFive = input / 5;

        for (int i = 0 ; i < needFive ; i++){
            bw.write(five);
        }
        for (int i = 0 ; i < needOne ; i++){
            bw.write(one);
        }

        bw.flush();
        bw.close();
    }
}
