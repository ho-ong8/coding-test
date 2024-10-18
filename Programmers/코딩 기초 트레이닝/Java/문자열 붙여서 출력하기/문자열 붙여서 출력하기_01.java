import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        // concat(): 문자열 병합
        System.out.println(a.concat(b));

        // join(): 문자열 병합
        // System.out.println(String.join("", a, b));
    }
}
