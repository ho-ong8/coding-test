import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist); // 오름차순 정렬
        int[] answer = new int[numlist.length];

        // numlist[i] = 이전 원소, numlist[j] = 다음 원소
        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                // 이전 원소가 다음 원소 이하일 경우
                if (Math.abs(n - numlist[i]) <= Math.abs(n - numlist[j])) {
                    int num = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = num;
                }
            }
        }

        for (int i = 0; i < numlist.length; i++) {
            answer[i] = numlist[i];
        }

        return answer;
    }
}
