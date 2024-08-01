import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String[] strArr = br.readLine().split(" ");

        Double a = Double.parseDouble(strArr[0]);
        Double b = Double.parseDouble(strArr[1]);

        String result = String.valueOf(a / b);

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
