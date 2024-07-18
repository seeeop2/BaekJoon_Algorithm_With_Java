import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseCount = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < testCaseCount ; i++){
            int num = Integer.parseInt(br.readLine());
            int absOfNum = Math.abs(num);

            if (absOfNum % 2 == 0){
                bw.write(num + " is even\n");
            } else{
                bw.write(num + " is odd\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
