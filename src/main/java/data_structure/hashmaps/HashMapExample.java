package data_structure.hashmaps;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        // HashMap 클래스를 이용해 해시맵 생성
        HashMap<String, Integer> hashMap = new HashMap<>();

        // 해시맵에 데이터 삽입
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);

        // 해시맵에서 데이터 삭제
        hashMap.remove("a");
        hashMap.remove("b");
        hashMap.remove("c");
    }
}
