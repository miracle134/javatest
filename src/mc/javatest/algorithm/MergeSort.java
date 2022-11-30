package mc.javatest.algorithm;

import java.util.Arrays;

/**
 * 합병 정렬
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {30, 15, 20, 25, 40, 45, 35, 10};

        MergeSort q = new MergeSort();
        System.out.printf("최초값 : %s\n", Arrays.toString(arr));

        int[] result = q.merge(arr);

        System.out.printf("정렬 : %s\n", Arrays.toString(result));
    }

    private int[] merge(int[] arr){


        return arr;
    }

}
