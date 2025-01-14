class Solution {
    public int solution(String num_str) {
        // 스트림 변환 -> 원소 매핑 -> 합계 계산
        // chars(): 스트림 변환 (문자 -> 스트림)
        // map(): 다른 형태의 원소로 매핑하여 반환
        // sum(): 합계 반환
        return num_str.chars().map(i -> i - 48).sum();
    }
}
