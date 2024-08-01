import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String input = br.readLine();

        if (input.equals("0")){
            bw.write("YONSEI");
        } else if(input.equals("1")){
            bw.write("Leading the Way to the Future");
        }
        
        bw.flush();
        bw.close();
    }
}
