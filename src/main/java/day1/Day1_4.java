package day1;

import java.util.Scanner;
/*
* 문제 설명
* 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
*
* 1 ≤ str의 길이 ≤ 20
* str은 알파벳으로 이루어진 문자열입니다.
*
* 입력 #1
* aBcDeFg
* 출력 #1
* AbCdEfG
* */
public class Day1_4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();

            // 길이 제한
            if(a.length() < 1 || a.length() > 20) {
                System.out.println("1 ≤ str의 길이 ≤ 20");
                return;
            }

            // 대문자 -> 소문자, 소문자 -> 대문자
            for(int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if(c >= 'A' && c <= 'Z') {
                    System.out.print((char)(c + 32));
                } else if(c >= 'a' && c <= 'z') {
                    System.out.print((char)(c - 32));
                }
            }
          /*  for(int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if(Character.isUpperCase(c)) {
                    System.out.print(Character.toLowerCase(c));
                } else if(Character.isLowerCase(c)) {
                    System.out.print(Character.toUpperCase(c));
                }
            }*/


        }
}
