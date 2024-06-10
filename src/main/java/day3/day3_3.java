package day3;

public class day3_3 {

/*
문제 설명
문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ my_string의 길이 ≤ 100
my_string은 영소문자로만 이루어져 있습니다.
1 ≤ k ≤ 100

입출력 예
my_string	k	result
"string"	3	"stringstringstring"
"love"	10	"lovelovelovelovelovelovelovelovelovelove"

입출력 예 설명
입출력 예 #1
예제 1번의 my_string은 "string"이고 이를 3번 반복한 문자열은 "stringstringstring"이므로 이를 return 합니다.
입출력 예 #2
예제 2번의 my_string은 "love"이고 이를 10번 반복한 문자열은 "lovelovelovelovelovelovelovelovelovelove"이므로 이를 return 합니다.
    */
      public static void main(String[] args) {
          String my_string = "string";
            int k = 3;
            System.out.println(solution(my_string, k));
    }

    private static String solution(String my_string, int k) {
        String answer = "";

        // 제한사항
        if (my_string.length() < 1 || my_string.length() > 100) {
            return "my_string의 길이는 1 이상 100 이하여야 합니다.";
        }
        if (k < 1 || k > 100) {
            return "k는 1 이상 100 이하여야 합니다.";
        }

        // my_string을 k번 반복
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }

        // 시간 복잡도 : O(n)
        // 공간 복잡도 : O(1)

        // 스트림 이용
        // answer = IntStream.range(0, k).mapToObj(i -> my_string).collect(Collectors.joining());

        // StringBuilder 이용
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < k; i++) {
        //     sb.append(my_string);
        // }

        // StringBuffer 이용
        // StringBuffer sb = new StringBuffer();
        // for (int i = 0; i < k; i++) {
        //     sb.append(my_string);
        // }

        // StringJoiner 이용
        // StringJoiner sj = new StringJoiner("");
        // for (int i = 0; i < k; i++) {
        //     sj.add(my_string);
        // }

        // StringJoiner 이용
        // StringJoiner sj = new StringJoiner("");
        // IntStream.range(0, k).forEach(i -> sj.add(my_string));
        // answer = sj.toString();

        // String.join 이용
        // answer = String.join("", Collections.nCopies(k, my_string));


        return answer;
    }
}
