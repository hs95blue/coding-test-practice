package day4;

public class day4_2 {

  /*  문제 설명
    정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

    제한사항
    10 ≤ number ≤ 100
    2 ≤ n, m < 10

    입출력 예
    number	n	m	result
    60	    2	3	1
    55	    10	5	0

    입출력 예 설명

    입출력 예 #1
    60은 2의 배수이면서 3의 배수이기 때문에 1을 return합니다.

    입출력 예 #2
    55는 5의 배수이지만 10의 배수가 아니기 때문에 0을 return합니다.*/
      public static void main(String[] args) {
          int number = 60;
          int n = 2;
          int m = 3;
          System.out.println(solution(number, n, m));

    }
    private static int solution(int number, int n, int m) {
        // 제한사항
        if(number < 10 || number > 100) {
            return 0;
        }
        if(n < 2 || n >= 10) {
            return 0;
        }
        if(m < 2 || m >= 10) {
            return 0;
        }
        // number가 n의 배수이면서 m의 배수이면 1을 return
        // 아니라면 0을 return
        if(number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
        // 시간 복잡도 : O(1)
        // 공간 복잡도 : O(1)

        // return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
