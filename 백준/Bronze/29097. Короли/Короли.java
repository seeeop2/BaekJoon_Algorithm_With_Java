import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int joffreyBattalions = Integer.parseInt(input[0]);
        int robbBattalions = Integer.parseInt(input[1]);
        int stannisBattalions = Integer.parseInt(input[2]);
        int joffreySoldiers = Integer.parseInt(input[3]);
        int robbSoldiers = Integer.parseInt(input[4]);
        int stannisSoldiers = Integer.parseInt(input[5]);

        int joffreyArmyStrength = joffreyBattalions * joffreySoldiers;
        int robbArmyStrength = robbBattalions * robbSoldiers;
        int stannisArmyStrength = stannisBattalions * stannisSoldiers;

        int maxArmyStrength = Math.max(joffreyArmyStrength, Math.max(robbArmyStrength, stannisArmyStrength));

        Map<String, Integer> armyMap = new HashMap<>();
        armyMap.put("Joffrey", joffreyArmyStrength);
        armyMap.put("Robb", robbArmyStrength);
        armyMap.put("Stannis", stannisArmyStrength);

        List<String> strongestKings = armyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxArmyStrength)
                .sorted(Map.Entry.comparingByKey())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        bw.write(String.join(" ", strongestKings));
        bw.flush();
        bw.close();
        br.close();
    }
}
