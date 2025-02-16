import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(n)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfPlayers = Integer.parseInt(br.readLine());
        int maxPrize = 0;

        for (int i = 0; i < numberOfPlayers; i++) {
            String[] diceRolls = br.readLine().split(" ");
            int firstDie = Integer.parseInt(diceRolls[0]);
            int secondDie = Integer.parseInt(diceRolls[1]);
            int thirdDie = Integer.parseInt(diceRolls[2]);

            int prize = 0;

            if (firstDie == secondDie && secondDie == thirdDie) {
                prize = 10000 + firstDie * 1000;
            } else if (firstDie == secondDie || firstDie == thirdDie || secondDie == thirdDie) {
                if (firstDie == secondDie) {
                    prize = 1000 + firstDie * 100;
                } else if (firstDie == thirdDie) {
                    prize = 1000 + firstDie * 100;
                } else {
                    prize = 1000 + secondDie * 100;
                }
            } else {
                int maxDie = Math.max(firstDie, Math.max(secondDie, thirdDie));
                prize = maxDie * 100;
            }
            maxPrize = Math.max(maxPrize, prize);
        }

        bw.write(Integer.toString(maxPrize));
        bw.flush();
        bw.close();
        br.close();
    }
}
