package day2;

import java.util.Scanner;

public class Day2_4 {

    /*
    문제 설명
    자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을,
    홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.

    제한사항
    1 ≤ n ≤ 1,000

    입출력 예
    입력 #1
    100
    출력 #1
    100 is even
    입력 #2
    1
    출력 #2
    1 is odd
            */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 제한사항
        // 1 ≤ n ≤ 1,000
        if(n < 1 || n > 1000) {
            System.out.println("1 ≤ n ≤ 1,000");
            return;
        }

        // n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력
  /*      if(n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }*/
        System.out.printf("%d is %s", n, n % 2 == 0 ? "even" : "odd");
        // 시간 복잡도: O(1)
        // 공간 복잡도: O(1)
    }
}
