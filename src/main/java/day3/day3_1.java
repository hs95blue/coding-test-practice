package day3;

public class day3_1 {
/*문제 설명
길이가 같은 두 문자열 str1과 str2가 주어집니다.

두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ str1의 길이 = str2의 길이 ≤ 10
str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.

입출력 예
str1	str2	result
"aaaaa"	"bbbbb"	"ababababab"*/

    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        System.out.println(solution(str1, str2));
    }

    public static String solution(String str1, String str2) {
        String answer = "";

        // 제한사항
        if (str1.length() < 1 || str1.length() > 10) {
            return "str1의 길이는 1 이상 10 이하여야 합니다.";
        }
        if (str2.length() < 1 || str2.length() > 10) {
            return "str2의 길이는 1 이상 10 이하여야 합니다.";
        }

        // 두 문자열의 길이가 같으므로 str1의 길이만큼 반복
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }

    // 시간 복잡도: O(n)
    // 공간 복잡도: O(1)



}
