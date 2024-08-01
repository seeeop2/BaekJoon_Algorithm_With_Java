import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int input = Integer.parseInt( br.readLine() );
        
        for (int i = 1 ; i < 10 ; i++ )
        {
            bw.write( input + " * " + i + " = " + input * i );
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
