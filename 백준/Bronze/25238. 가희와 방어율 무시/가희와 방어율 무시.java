import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputValues = br.readLine().split(" ");
        double monsterDefense = Double.parseDouble(inputValues[0]);
        double userDefenseIgnore = Double.parseDouble(inputValues[1]);

        double defenseIgnored = (userDefenseIgnore / 100) * monsterDefense;
        double effectiveDefense = monsterDefense - defenseIgnored;

        String result = effectiveDefense >= 100 ? "0" : "1";

        bw.write(result);

        bw.flush();
        br.close();
        bw.close();
    }
}
