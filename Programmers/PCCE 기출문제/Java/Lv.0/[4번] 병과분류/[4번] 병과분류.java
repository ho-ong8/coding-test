import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();

        // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
        String lastFourWords = code.substring(code.length() - 4, code.length());

        // equals(): 문자열 비교
        // "_eye"일 경우 "Ophthalmologyc"
        if (lastFourWords.equals("_eye")) {
            System.out.println("Ophthalmologyc");
        // "head"일 경우 "Neurosurgery"
        } else if (lastFourWords.equals("head")) {
            System.out.println("Neurosurgery");
        // "infl"일 경우 "Orthopedics"
        } else if (lastFourWords.equals("infl")) {
            System.out.println("Orthopedics");
        // "skin"일 경우 "Dermatology"
        } else if (lastFourWords.equals("skin")) {
            System.out.println("Dermatology");
        // 그 외일 경우 "direct recommendation"
        } else {
            System.out.println("direct recommendation");
        }
    }
}
