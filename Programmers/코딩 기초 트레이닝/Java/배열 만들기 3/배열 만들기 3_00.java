import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            // copyOfRange(array, startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 배열 복사
            int[] num = Arrays.copyOfRange(arr, intervals[i][0], intervals[i][1] + 1);

            for (int j = 0; j < num.length; j++) {
                // add(): 원소 추가
                list.add(num[j]);
            }
        }

        // size(): 컬렉션 타입 길이 반환
        int[] answer = new int[list.size()];
        int cnt = 0; // 인덱스

        for (int i = 0; i < list.size(); i++) {
            // get(): 원소 반환
            answer[cnt++] = list.get(i);
        }

        return answer;
    }
}
