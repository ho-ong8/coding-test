class Solution {
    public String solution(String my_string) {
        // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (regex: 정규표현식)
        // [aeiou]: a, e, i, o, u (or)
        return my_string.replaceAll("[aeiou]", "");

        // a|e|i|o|u: a, e, i, o, u (or)
        // return my_string.replaceAll("a|e|i|o|u", "");
    }
}
