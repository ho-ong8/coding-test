import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        int cnt = 0; // 2의 개수

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                // add(): 원소 추가
                list.add(i);
                cnt++;
            }
        }

        // 0일 경우
        if (cnt == 0) {
            return new int[] {-1};
        }

        // copyOfRange(array, startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 배열 복사
        // get(): 원소 반환
        // size(): 컬렉션 타입 길이 반환
        return Arrays.copyOfRange(arr, list.get(0), list.get(list.size() - 1) + 1);
    }
}
