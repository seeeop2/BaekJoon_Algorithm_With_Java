import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x > 0){
            if (y > 0){
                bw.write("1");
            }
            if (y < 0){
                bw.write("4");
            }
        }
        if (x < 0){
            if (y > 0){
                bw.write("2");
            }
            if (y < 0){
                bw.write("3");
            }
        }

        bw.flush();
        bw.close();
    }
}
