package day3;

public class day3_2 {

/*    문제 설명
문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 200
arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.

입출력 예
arr	result
["a","b","c"]	"abc"*/
    public static void main(String[] args) {
      String[] arr = {"a","b","c"};
      System.out.println(solution(arr));
    }


    public static String solution(String[] arr) {
        String answer = "";

        // 제한사항
        if (arr.length < 1 || arr.length > 200) {
            return "arr의 길이는 1 이상 200 이하여야 합니다.";
        }

        // arr의 원소들을 순서대로 이어 붙인 문자열
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        // 스트림 이용
        // answer = Arrays.stream(arr).collect(Collectors.joining());

        // StringBuilder 이용
        // StringBuilder sb = new StringBuilder();
        // for (String s : arr) {
        //     sb.append(s);
        // }
        // answer = sb.toString();

        // StringBuffer 이용
        // StringBuffer sb = new StringBuffer();
        // for (String s : arr) {
        //     sb.append(s);
        // }
        // answer = sb.toString();


        // StringJoiner 이용
        // StringJoiner sj = new StringJoiner("");
        // for (String s : arr) {
        //     sj.add(s);
        // }
        // answer = sj.toString();

        // StringJoiner 이용
        // StringJoiner sj = new StringJoiner("");
        // Arrays.stream(arr).forEach(sj::add);
        // answer = sj.toString();

        // StringJoiner 이용
        // StringJoiner sj = new StringJoiner("");
        // Arrays.stream(arr).forEach(s -> sj.add(s));
        // answer = sj.toString();

        // String.join 이용
        // answer = String.join("", arr);


        return answer;
    }

    // 시간 복잡도: O(n)
    // 공간 복잡도: O(1)

}
