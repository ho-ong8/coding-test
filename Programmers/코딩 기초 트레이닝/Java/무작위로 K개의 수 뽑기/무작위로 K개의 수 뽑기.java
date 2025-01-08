import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        // set 생성 (중복 제거)
        Set<Integer> set = new HashSet<>();

        int[] answer = new int[k];
        int cnt = 0; // 서로 다른 수의 개수

        for (int i = 0; i < arr.length; i++) {
            // contains(): 문자열 포함 여부 확인
            if (!set.contains(arr[i])) {
                answer[cnt++] = arr[i];

                // add(): 원소 추가
                set.add(arr[i]);
            }

            // 서로 다른 수의 개수와 k가 같을 경우
            if (cnt == k) {
                break;
            }
        }

        for (int i = cnt; i < k; i++) {
            answer[i] = -1;
        }

        return answer;
    }
}
