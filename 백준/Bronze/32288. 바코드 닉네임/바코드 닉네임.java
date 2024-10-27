import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        String inputString = br.readLine();

        for (int i = 0; i < length; i++) {
            char currentChar = inputString.charAt(i);
            boolean isLowerCase = Character.isLowerCase(currentChar);
            char changedChar = isLowerCase ? Character.toUpperCase(currentChar) : Character.toLowerCase(currentChar);
            bw.write(changedChar);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
