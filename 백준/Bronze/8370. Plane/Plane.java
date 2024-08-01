import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int[] intArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rowsOfBusinessClass = intArr[0];
        int seatsOfEachRowsBusinessClass = intArr[1];
        int rowsOfEconomicClass = intArr[2];
        int seatsOfEachRowsEconomicClass = intArr[3];

        String output = String.valueOf(rowsOfBusinessClass * seatsOfEachRowsBusinessClass + rowsOfEconomicClass * seatsOfEachRowsEconomicClass );

        bw.write(output);
        
        bw.flush();
        bw.close();
    }
}
