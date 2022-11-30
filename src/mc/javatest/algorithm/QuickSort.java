package mc.javatest.algorithm;

import java.util.Arrays;

/**
 * 퀵 정렬
 */
public class QuickSort {

    int[] arr = {4, 1, 9, 2, 6, 8, 3, 5, 7};
    int size = 9;

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        System.out.printf("최초값 : %s\n", Arrays.toString(q.arr));

        q.quick(q.arr, 0, q.size - 1);
    }

    private void quick(int[] arr, int leftHigh, int rightLow) {

        // leftHigh 인덱스와 rightLow 인덱스가 교차라면 그만합니다.
        if (leftHigh >= rightLow) return;

        int tmp;
        int pivot = leftHigh;
        int left = leftHigh;
        int right = rightLow;

        // leftHigh 인덱스와 rightLow 인덱스가 교차되면 그만합니다.
        while (left < right) {

            // 왼쪽에서 부터 큰값을 찾습니다.
            while (left <= rightLow && arr[pivot] >= arr[left]){
                left++;
            }
            // 오른쪽에서 부터 작은값을 찾습니다.
            while (right > leftHigh && arr[pivot] <= arr[right]){
                right--;
            }

            // 큰값 인덱스가 작은값보다 작으면 교환합니다.
            if(left < right) {
                tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;

            // 큰값 인덱스가 작은값보다 작지 않으면 피벗위치를 작은 교환합니다.
            }else{
                tmp = arr[right];
                arr[right] = arr[pivot];
                arr[pivot] = tmp;
            }
        }

        System.out.printf("%s\n", Arrays.toString(arr));

        // 나누어진 배열의 왼쪽
        quick(arr, leftHigh, right-1);
        // 나누어진 배열의 오른쪽
        quick(arr, right+1, rightLow);
    }

}
