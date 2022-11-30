package mc.javatest.algorithm;

import java.util.Arrays;

/**
 * 선택 정렬
 */
public class SelectionSort {

    public static void main(String[] args) {
        int min, index, tmp;
        int[] arr = {9, 1, 6, 5, 8, 4, 3, 2, 7};

        System.out.printf("최초값 : %s\n", Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            min = Integer.MAX_VALUE;
            index = -1;

            // 최솟값 찾기
            for (int j = i; j < arr.length; j++) {
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }

            // 최솟값을 현재 index와 교체
            tmp = arr[i];
            arr[i] = min;
            arr[index] = tmp;

            System.out.printf("%s번째 : %s\n", i+1, Arrays.toString(arr));
        }

    }

}
