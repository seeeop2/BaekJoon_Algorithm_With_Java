import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int availableChickens = Integer.parseInt(br.readLine());
        String[] drinkCounts = br.readLine().split(" ");
        int colaCount = Integer.parseInt(drinkCounts[0]);
        int beerCount = Integer.parseInt(drinkCounts[1]);

        int maxChickensFromCola = colaCount / 2;
        int maxChickensFromBeer = beerCount;

        int totalChickens = Math.min(availableChickens, (maxChickensFromCola + maxChickensFromBeer));

        bw.write(totalChickens + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
