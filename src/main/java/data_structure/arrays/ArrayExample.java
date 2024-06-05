package data_structure.arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // 배열 선언
        int[] arr = new int[5];

        // 배열 초기화
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // 배열 출력
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
