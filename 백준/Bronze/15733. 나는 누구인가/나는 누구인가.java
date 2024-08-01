import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String output = "I'm Sexy";
        
        bw.write(output);
        
        bw.flush();
        bw.close();
    }
}
