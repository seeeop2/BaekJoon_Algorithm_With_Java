import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String getTaxiTimeInput = br.readLine().replace(" ","");
        String getOutOfTaxiTimeInput = br.readLine().replace(" ","");

        LocalTime getTaxi = LocalTime.parse(getTaxiTimeInput, DateTimeFormatter.ofPattern("H:m:s"));
        LocalTime getOutOfTaxi = LocalTime.parse(getOutOfTaxiTimeInput, DateTimeFormatter.ofPattern("H:m:s"));

        int getTaxiHours = getTaxi.getHour();
        int getTaxiMinutes = getTaxi.getMinute();
        int getTaxiSeconds = getTaxi.getSecond();

        int getOutOfTaxiHours = getOutOfTaxi.getHour();
        int getOutOfTaxiMinutes = getOutOfTaxi.getMinute();
        int getOutOfTaxiSeconds = getOutOfTaxi.getSecond();

        int totalSeconds1 = getTaxiHours * 3600 + getTaxiMinutes * 60 + getTaxiSeconds;
        int totalSeconds2 = getOutOfTaxiHours * 3600 + getOutOfTaxiMinutes * 60 + getOutOfTaxiSeconds;

        int secondsInADay = 60 * 60 * 24;


        int timeDifferenceInSeconds = getTaxi.isAfter(getOutOfTaxi) ? totalSeconds2 - totalSeconds1 + secondsInADay : totalSeconds2 - totalSeconds1;
        
        bw.write(String.valueOf(timeDifferenceInSeconds));

        bw.flush();
        br.close();
        bw.close();
    }
}
