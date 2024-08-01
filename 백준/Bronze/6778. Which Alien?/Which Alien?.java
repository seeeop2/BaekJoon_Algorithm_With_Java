import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfAntenna = Integer.parseInt(br.readLine());
        int numberOfEyes = Integer.parseInt(br.readLine());

        if (numberOfAntenna >= 3 && numberOfEyes <= 4) {
            bw.write("TroyMartian");
            bw.newLine();
        }
        if (numberOfAntenna <= 6 && numberOfEyes >= 2) {
            bw.write("VladSaturnian");
            bw.newLine();
        }
        if (numberOfAntenna <= 2 && numberOfEyes <= 3) {
            bw.write("GraemeMercurian");
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
