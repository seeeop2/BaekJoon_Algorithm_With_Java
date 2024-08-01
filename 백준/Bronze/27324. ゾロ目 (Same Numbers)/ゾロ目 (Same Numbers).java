import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        if (input < 10 || input > 99){
            throw new RuntimeException("Number is greater than or equal to 10 and less than or equal to 99 ");
        }

        int firstInt = input / 10;
        int secondInt = input % 10;

        if (firstInt == secondInt){
            bw.write("1");
        }
        else{
            bw.write("0");
        }
        
        bw.flush();
        bw.close();
    }
}
