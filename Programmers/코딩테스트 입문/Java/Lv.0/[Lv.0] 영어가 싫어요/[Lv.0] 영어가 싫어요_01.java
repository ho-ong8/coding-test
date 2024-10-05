class Solution {
    public long solution(String numbers) {
        // replace(target, replacement): 문자열을 다른 문자열로 치환
        numbers = numbers
            .replace("zero", "0")
            .replace("one", "1")
            .replace("two", "2")
            .replace("three", "3")
            .replace("four", "4")
            .replace("five", "5")
            .replace("six", "6")
            .replace("seven", "7")
            .replace("eight", "8")
            .replace("nine", "9");

        // Long.parseLong(): 정수 변환
        return Long.parseLong(numbers);
    }
}
