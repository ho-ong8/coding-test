import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            int num = i; // 정수
            boolean bool = true; // 추가 여부

            while (num > 0) {
                int n = num % 10;

                // 0과 5가 아닐 경우
                if (n != 0 && n != 5) {
                    bool = false;
                    break;
                }

                num /= 10;

                // num % 10, num / 10 하는 이유?
                // num % 10 => 1의 자릿수 분리 (나머지)
                // num / 10 => 10의 자릿수 -> 1의 자릿수 변환 (몫)
            }

            // true일 경우
            if (bool) {
                // add(): 원소 추가
                list.add(i);
            }
        }

        // size(): 컬렉션 타입 길이 반환
        int[] answer = new int[list.size()];

        // isEmpty(): 문자열의 길이가 0일 경우 true 반환
        // 빈 리스트일 경우
        if (list.isEmpty()) {
            return new int[] {-1};
        } else {
            for (int i = 0; i < list.size(); i++) {
                // get(): 원소 반환
                answer[i] = list.get(i);
            }
        }

        return answer;
    }
}
