import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while(true){
            Double input = Double.parseDouble(br.readLine());

            if (input == 0){
                break;
            }
            
            double pow2 = Math.pow(input, 2);
            double pow3 = Math.pow(input, 3);
            double pow4 = Math.pow(input, 4);

            Double result = 1 + input + pow2 + pow3 + pow4;
            String resultToString = String.format("%.2f",result);

            bw.write(resultToString + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
