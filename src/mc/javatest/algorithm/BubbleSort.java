package mc.javatest.algorithm;

import java.util.Arrays;

/**
 * 버블 정렬
 */
public class BubbleSort {

    public static void main(String[] args) {
        int tmp;
        int[] arr = {9, 1, 6, 5, 8, 4, 3, 2, 7};

        System.out.printf("최초값 : %s\n", Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }

            System.out.printf("%s번째 : %s\n", i+1, Arrays.toString(arr));
        }

    }

}
