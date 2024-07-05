import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            int sizeOfStar = Integer.parseInt(br.readLine());

            if (sizeOfStar == 0){
                break;
            }

            for (int i = 0 ; i < sizeOfStar ; i++){
                for(int j = 0 ; j <= i ; j++){
                    bw.write("*");
                }
                bw.newLine();
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
