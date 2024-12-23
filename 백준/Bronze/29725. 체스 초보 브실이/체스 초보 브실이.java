import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    // 시간 복잡도: O(1)
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalScore = 0;

        for (int i = 0; i < 8; i++){
            char[] boardRow = br.readLine().toCharArray();
            for (int col = 0; col < 8; col++){
                int pieceScore = 0;
                switch(boardRow[col]){
                    case 'Q':
                    case 'q': pieceScore = 9; break;
                    case 'R':
                    case 'r': pieceScore = 5; break;
                    case 'B':
                    case 'b':
                    case 'N':
                    case 'n': pieceScore = 3; break;
                    case 'P':
                    case 'p': pieceScore = 1; break;
                }

                boolean isWhitePiece = Character.isUpperCase(boardRow[col]);

                if(isWhitePiece){
                    totalScore += pieceScore;
                } else {
                    totalScore -= pieceScore;
                }
            }
        }

        bw.write(Integer.toString(totalScore));

        bw.flush();
        bw.close();
        br.close();
    }
}
