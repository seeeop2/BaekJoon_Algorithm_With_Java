import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int arrivalDay = Integer.parseInt(input[0]);
        int departureDay = Integer.parseInt(input[1]);
        int visitDay = Integer.parseInt(input[2]);

        String result = (arrivalDay <= visitDay && visitDay < departureDay) ? "1" : "0";

        bw.write(result);
        
        bw.flush();
        br.close();
        bw.close();
    }
}
