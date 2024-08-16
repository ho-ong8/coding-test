import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); // 오름차순 정렬
        int answer = 0; // 최빈값
        int max = array[array.length - 1]; // 최댓값
        int[] cnt = new int[max + 1]; // 빈도수

        // 빈도수 구하기
        for (int i = 0; i < array.length; i++) {
            cnt[array[i]]++;
        }

        max = cnt[0]; // 최댓값 초기화

        // 최빈값 구하기
        for (int i = 1; i < cnt.length; i++) {
            // 빈도수가 클 경우 (최빈값 1개)
            if (max < cnt[i]) {
                max = cnt[i]; // 최댓값 변경
                answer = i;
            // 최댓값과 빈도수가 같을 경우 (최빈값 여러 개)
            } else if (max == cnt[i]) {
                answer = -1;
            }
        }

        return answer;
    }
}
