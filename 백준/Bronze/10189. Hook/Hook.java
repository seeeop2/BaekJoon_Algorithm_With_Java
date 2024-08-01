import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
            String hook = "#  # #### #### #  #\n" +
                        "#### #  # #  # # #\n"    +
                        "#### #  # #  # # #\n"    +
                        "#  # #### #### #  #";

            bw.write(hook);
    
            bw.flush();
            bw.close();
    }
}
