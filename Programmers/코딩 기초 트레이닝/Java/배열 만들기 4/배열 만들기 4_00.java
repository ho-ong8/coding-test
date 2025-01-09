import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // isEmpty(): 문자열의 길이가 0일 경우 true 반환
            // 빈 리스트일 경우
            if (list.isEmpty()) {
                // add(): 원소 추가
                list.add(arr[i]);
            // 리스트의 마지막 원소가 작을 경우
            } else if (list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
            } else {
                // remove(): 원소 제거
                // size(): 컬렉션 타입 길이 반환
                list.remove(list.size() - 1);
                i--;
            }
        }

        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
