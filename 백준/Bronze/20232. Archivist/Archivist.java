import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, String> yearToWinnerMap = new HashMap<>();

        yearToWinnerMap.put(1995, "ITMO");
        yearToWinnerMap.put(1996, "SPbSU");
        yearToWinnerMap.put(1997, "SPbSU");
        yearToWinnerMap.put(1998, "ITMO");
        yearToWinnerMap.put(1999, "ITMO");
        yearToWinnerMap.put(2000, "SPbSU");
        yearToWinnerMap.put(2001, "ITMO");
        yearToWinnerMap.put(2002, "ITMO");
        yearToWinnerMap.put(2003, "ITMO");
        yearToWinnerMap.put(2004, "ITMO");
        yearToWinnerMap.put(2005, "ITMO");
        yearToWinnerMap.put(2006, "PetrSU, ITMO");
        yearToWinnerMap.put(2007, "SPbSU");
        yearToWinnerMap.put(2008, "SPbSU");
        yearToWinnerMap.put(2009, "ITMO");
        yearToWinnerMap.put(2010, "ITMO");
        yearToWinnerMap.put(2011, "ITMO");
        yearToWinnerMap.put(2012, "ITMO");
        yearToWinnerMap.put(2013, "SPbSU");
        yearToWinnerMap.put(2014, "ITMO");
        yearToWinnerMap.put(2015, "ITMO");
        yearToWinnerMap.put(2016, "ITMO");
        yearToWinnerMap.put(2017, "ITMO");
        yearToWinnerMap.put(2018, "SPbSU");
        yearToWinnerMap.put(2019, "ITMO");

        int inputYear = Integer.parseInt(br.readLine());
        String winner = yearToWinnerMap.get(inputYear);

        bw.write(winner);

        bw.flush();
        br.close();
        bw.close();
    }
}
