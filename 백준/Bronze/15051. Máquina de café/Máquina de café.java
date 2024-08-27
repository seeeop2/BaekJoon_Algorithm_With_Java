import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> peopleOnFloors = new ArrayList<>();
        int minimumTime = Integer.MAX_VALUE;

        // 층별 인원 수 입력 받기
        for (int i = 0; i < 3; i++) {
            peopleOnFloors.add(Integer.parseInt(br.readLine()));
        }

        // 각 층에서의 총 필요 시간 계산
        for (int coffeeMachineFloor = 0; coffeeMachineFloor < peopleOnFloors.size(); coffeeMachineFloor++) {
            int totalTimeForCurrentFloor = 0;

            for (int otherFloor = 0; otherFloor < peopleOnFloors.size(); otherFloor++) {
                if (coffeeMachineFloor == otherFloor) {
                    continue; // 동일한 층은 계산하지 않음
                }

                int floorDifference = Math.abs(otherFloor - coffeeMachineFloor);
                int timePerFloor = peopleOnFloors.get(otherFloor) * floorDifference * 2;
                totalTimeForCurrentFloor += timePerFloor;
            }

            // 최소 시간 업데이트
            minimumTime = Math.min(minimumTime, totalTimeForCurrentFloor);
        }

        bw.write(String.valueOf(minimumTime));
        
        bw.flush();
        br.close();
        bw.close();
    }
}
