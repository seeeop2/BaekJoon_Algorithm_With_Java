import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] todayWeather = br.readLine().split(" ");
        int todayTemperature = Integer.parseInt(todayWeather[0]);
        int todayWindSpeed = Integer.parseInt(todayWeather[1]);

        String[] tomorrowWeather = br.readLine().split(" ");
        int tomorrowTemperature = Integer.parseInt(tomorrowWeather[0]);
        int tomorrowWindSpeed = Integer.parseInt(tomorrowWeather[1]);

        String warningMessage = "No message";

        if (tomorrowTemperature < 0 && tomorrowWindSpeed >= 10) {
            warningMessage = "A storm warning for tomorrow! Be careful and stay home if possible!";
        } else if (tomorrowTemperature < todayTemperature) {
            warningMessage = "MCHS warns! Low temperature is expected tomorrow.";
        } else if (tomorrowWindSpeed > todayWindSpeed) {
            warningMessage = "MCHS warns! Strong wind is expected tomorrow.";
        }

        bw.write(warningMessage);

        bw.flush();
        br.close();
        bw.close();
    }
}
