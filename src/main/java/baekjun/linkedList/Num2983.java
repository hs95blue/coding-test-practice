package baekjun.linkedList;

import data_structure.stacks.LinkedListStack;

import java.io.*;
import java.sql.Array;
import java.util.LinkedList;

public class Num2983 {
    /*
    * 상근이 호수 휴식
    * 개구리 점프 식물 N개
    * 개구리 잡기!
    *
    * 호수: 2차원 평면
    * 식물: 평면위의 점
    * A: +P, +P
    * B: +P, -P
    * C: -P, +P
    * D: -P, -P
    *
    * 방향 고르고
    * 가장 가까운 식물로 점프
    * 없으면 제자리
    *
    * 점프 이후 없어짐
    *
    * 개구리 점프가 끝나는 식물의 위치?
    * 제자리에 있거나 모든 식물이 가라앉았거나?
    *
    * 첫째
    * N: 식물 수
    * K: 점프 수
    *
    * 둘째
    * K: 방향
    *
    * 셋째 ~
    * N: 식물의 좌표
    * 어디가 연결리스트여??..;;
    * 일단 연결해? 흠
    * tail값이 끝나는 위치인가?
    * 방향대로 했을때 그 다음 거가 조건에 맞으면 추가 아니면 제거?
    * 굳이 필요?
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 입력받기
        String firstInput = br.readLine();
        int plantCnt = Integer.parseInt(firstInput.split(" ")[0]);
        int jumpCnt = Integer.parseInt(firstInput.split(" ")[1]);

        String secondInput = br.readLine();
        char[] command = secondInput.toCharArray();
        // 식물을 연결리스트에 넣어놓고 새로운 연결리스트를 만드는게 나을 것같기도
        LinkedList<Plant> plantLinkedList = new LinkedList<>();
        for(int i=0;i<plantCnt;i++){
            String spot = br.readLine();

        }



    }
     public static class Plant{
        int x;
        int y;

        public Plant(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

}
