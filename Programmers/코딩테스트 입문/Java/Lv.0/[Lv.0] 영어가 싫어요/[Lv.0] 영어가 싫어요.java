class Solution {
    public long solution(String numbers) {
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < str.length; i++) {
            // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (regex: 정규표현식)
            // String.valueOf(): 문자열 변환
            numbers = numbers.replaceAll(str[i], String.valueOf(i));
        }

        // Long.parseLong(): 정수 변환
        return Long.parseLong(numbers);
    }
}
