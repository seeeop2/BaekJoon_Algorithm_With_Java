import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfSubjects = Integer.parseInt(br.readLine());
        String[] scoreInputs = br.readLine().split(" ");

        int koreanScore = numberOfSubjects > 0 ? Integer.parseInt(scoreInputs[0]) : 0;
        int mathScore = numberOfSubjects > 1 ? Integer.parseInt(scoreInputs[1]) : 0;
        int englishScore = numberOfSubjects > 2 ? Integer.parseInt(scoreInputs[2]) : 0;
        int inquiryScore = numberOfSubjects > 3 ? Integer.parseInt(scoreInputs[3]) : 0;
        int secondLanguageScore = numberOfSubjects > 4 ? Integer.parseInt(scoreInputs[4]) : 0;

        int firstScore = (koreanScore > englishScore)
                ? (koreanScore - englishScore) * 508
                : (englishScore - koreanScore) * 108;

        int secondScore = (mathScore > inquiryScore)
                ? (mathScore - inquiryScore) * 212
                : (inquiryScore - mathScore) * 305;

        int thirdScore = secondLanguageScore * 707;

        int totalScore = firstScore + secondScore + thirdScore;
        int studentId = totalScore * 4763;

        bw.write(String.valueOf(studentId));

        bw.flush();
        bw.close();
        br.close();
    }
}
