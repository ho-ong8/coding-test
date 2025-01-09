import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            // Integer.parseInt(): 정수 변환
            // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
            int num = Integer.parseInt(intStrs[i].substring(s, s + l)); // 정수

            // k보다 클 경우
            if (num > k) {
                // add(): 원소 추가
                list.add(num);
            }
        }

        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
