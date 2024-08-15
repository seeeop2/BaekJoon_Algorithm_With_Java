import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double milesPerGallon = Double.parseDouble(br.readLine());
        double gallonToLiter = 3.785411784;
        double mileToMeter = 1609.344;
        double metersPer100Km = 100000;

        double totalLiters = gallonToLiter * metersPer100Km;
        double totalMeters = mileToMeter * milesPerGallon;

        double litersPer100Km = totalLiters / totalMeters;

        bw.write(String.format("%.6f", litersPer100Km));

        bw.flush();
        br.close();
        bw.close();
    }
}
