package mc.javatest.algorithm;

import java.util.Arrays;

/**
 * 삽입 정렬
 */
public class InsertionSort {

    public static void main(String[] args) {
        int tmp, index;
        int[] arr = {9, 1, 6, 5, 8, 4, 3, 2, 7};

        System.out.printf("최초값 : %s\n", Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            tmp = arr[i];
            index = i - 1;

            while (index >= 0 && arr[index] > tmp) {
                arr[index + 1] = arr[index];
                index--;
            }

            arr[index + 1] = tmp;
            System.out.printf("%s번째 : %s\n", i + 1, Arrays.toString(arr));
        }

    }

}
