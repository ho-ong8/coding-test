class Solution {
    public String solution(String my_string, int s, int e) {
        // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
        // StringBuilder, StringBuffer: 가변 문자열을 처리하기 위한 클래스 (가변, 기존 객체에 추가 및 변경)
        // StringBuidler는 싱글스레드, StringBuffer는 멀티스레드 환경에서 유리하다.
        // 문자열 연산 시 기존 데이터 참조 => 연산 속도가 빠르고, 상대적으로 부하가 적다.
        // 사용 후 String 변환 => String.valueOf(), toString()
        // reverse(): 반전 반환
        return my_string.substring(0, s) + new StringBuilder(my_string.substring(s, e + 1)).reverse().toString() + my_string.substring(e + 1);
    }
}
