import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int num = 0;

        String[] strArr = br.readLine().trim().split(" ");

        if (strArr[0].equals("") && strArr.length == 1){
            num = 0;
        } else {
            num = strArr.length;
        }

        String result = String.valueOf(num);

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
