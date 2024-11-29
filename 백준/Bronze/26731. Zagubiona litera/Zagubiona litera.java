import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputLetters = br.readLine();

        for (int asciiCode = 65; asciiCode <= 90; asciiCode++) {
            char currentLetter = (char) asciiCode;
            boolean isContained = inputLetters.contains(Character.toString(currentLetter));
            
            if (!isContained) {
                bw.write(currentLetter);
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
