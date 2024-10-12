import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int[] num = new int[200];

        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0] + 100; // 시작
            int end = lines[i][1] + 100; // 마지막

            for (int j = start; j < end; j++) {
                num[j]++;
            }
        }

        // 배열 스트림 생성 -> 원소 추출 -> 개수 계산
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // count(): 개수 반환
        return (int) Arrays.stream(num).filter(i -> i > 1).count();
    }
}
