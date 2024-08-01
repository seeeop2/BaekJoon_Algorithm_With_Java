import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, team> scoreBoard = new HashMap<>();

        scoreBoard.put(1,new team(12,1600));
        scoreBoard.put(2,new team(11,894));
        scoreBoard.put(3,new team(11,1327));
        scoreBoard.put(4,new team(10,1311));
        scoreBoard.put(5,new team(9,1004));
        scoreBoard.put(6,new team(9,1178));
        scoreBoard.put(7,new team(9,1357));
        scoreBoard.put(8,new team(8,837));
        scoreBoard.put(9,new team(7,1055));
        scoreBoard.put(10,new team(6,556));
        scoreBoard.put(11,new team(6,773));

        int n = Integer.parseInt(br.readLine());
        String output = scoreBoard.get(n).result();

        bw.write(output);

        bw.flush();
        bw.close();
    }

    static class team {
        int correct;
        int time;

        public team(int correct, int time) {
            this.correct = correct;
            this.time = time;
        }

        public String result(){
            String output = correct + " " + time;
            return output;
        }
        
    }
}
