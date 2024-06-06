package day3;

public class day3_4 {
    /*문제 설명
연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

12 ⊕ 3 = 123
3 ⊕ 12 = 312
양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.

단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.

제한사항
1 ≤ a, b < 10,000
입출력 예
a	b	result
9	91	991
89	8	898
입출력 예 설명
입출력 예 #1

a ⊕ b = 991 이고, b ⊕ a = 919 입니다. 둘 중 더 큰 값은 991 이므로 991을 return 합니다.
입출력 예 #2

a ⊕ b = 898 이고, b ⊕ a = 889 입니다. 둘 중 더 큰 값은 898 이므로 898을 return 합니다.*/
      public static void main(String[] args) {
        int a = 9;
        int b = 91;
        System.out.println(solution(a, b));
    }

    public static int solution(int a, int b) {
        int answer = 0;

        // 제한사항
        if (a < 1 || a >= 10000) {
            return 0;
        }
        if (b < 1 || b >= 10000) {
            return 0;
        }

        // a ⊕ b와 b ⊕ a 중 더 큰 값
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        if (ab > ba) {
            answer = ab;
        } else {
            answer = ba;
        }

        return answer;

        // 시간 복잡도 : O(1)
        // 공간 복잡도 : O(1)

        // 다른 풀이
        // return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));

        // 다른 풀이
        // return Integer.parseInt(a + "" + b) > Integer.parseInt(b + "" + a) ? Integer.parseInt(a + "" + b) : Integer.parseInt(b + "" + a);

        // 다른 풀이
        // return Integer.parseInt(String.valueOf(a) + String.valueOf(b)) > Integer.parseInt(String.valueOf(b) + String.valueOf(a)) ? Integer.parseInt(String.valueOf(a) + String.valueOf(b)) : Integer.parseInt(String.valueOf(b) + String.valueOf(a));


    }
}
