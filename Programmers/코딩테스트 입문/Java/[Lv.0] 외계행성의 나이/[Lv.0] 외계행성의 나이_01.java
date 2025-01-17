class Solution {
    public String solution(int age) {
        // String: 불변 문자열을 처리하기 위한 클래스 (불변, 신규 객체로 추가 및 변경)
        // 문자열 연산 시 신규 메모리 할당 및 해제 => 연산이 많을 경우 성능상 좋지 않다.

        // StringBuilder, StringBuffer: 가변 문자열을 처리하기 위한 클래스 (가변, 기존 객체에 추가 및 변경)
        // StringBuidler는 싱글스레드, StringBuffer는 멀티스레드 환경에서 유리하다.
        // 문자열 연산 시 기존 데이터 참조 => 연산 속도가 빠르고, 상대적으로 부하가 적다.
        // 사용 후 String 변환 => String.valueOf(), toString()
        StringBuilder sb = new StringBuilder(); // PROGRAMMERS-962식 나이

        while (age > 0) {
            // insert(): 문자열 삽입
            sb.insert(0, (char) (age % 10 + (int) 'a'));
            age /= 10;

            // age % 10, age / 10 하는 이유?
            // age % 10 => 1의 자릿수 분리 (나머지)
            // age / 10 => 10의 자릿수 -> 1의 자릿수 변환 (몫)
        }

        return sb.toString();
    }
}
