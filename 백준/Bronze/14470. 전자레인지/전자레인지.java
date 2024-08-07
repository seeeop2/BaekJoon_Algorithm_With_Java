import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int initialTemp = Integer.parseInt(br.readLine());
        int targetTemp = Integer.parseInt(br.readLine());
        int frozenHeatingTime = Integer.parseInt(br.readLine());
        int defrostingTime = Integer.parseInt(br.readLine());
        int nonFrozenHeatingTime = Integer.parseInt(br.readLine());
        int totalTime = 0;
        boolean isFrozen = true;

        while (initialTemp < targetTemp) {
            if (initialTemp < 0) {
                totalTime += frozenHeatingTime;
                initialTemp++;
            } else if (initialTemp == 0 && isFrozen) {
                totalTime += defrostingTime;
                isFrozen = false;
            } else {
                totalTime += nonFrozenHeatingTime;
                initialTemp++;
            }
        }

        bw.write(String.valueOf(totalTime));

        bw.flush();
        br.close();
        bw.close();
    }
}
