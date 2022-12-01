package mc.javatest.algorithm;

import java.util.Arrays;

/**
 * 합병 정렬
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {30, 15, 20, 25, 40, 45, 35, 10};

        System.out.printf("최초값 : %s\n", Arrays.toString(arr));

        MergeSort q = new MergeSort();

        q.division(arr, 0, arr.length - 1);

        System.out.printf("정렬 : %s\n", Arrays.toString(arr));
    }

    private void division(int[] list, int left, int right) {
        int mid;

        // 요소가 2개 이상일때 까지 들어오면 결과적으로 최소 1개로 분할 된다
        if (left < right) {
            mid = (left + right) / 2; // 분할
            division(list, left, mid); // 분할값의 왼쪽 분할
            division(list, mid + 1, right); // 분할값의 오른쪽 분할
            mergeSort(list, left, mid, right); // 분할을 합병하며 정렬한다.
        }

    }

    private void mergeSort(int[] list, int left, int mid, int right) {
        /**
         *  int[] tmp : 임시 복사 배열로 보통 클래스 변수나 지역변수로 설정하여 재사용할 수 있으나
         *              여기서는 흐름 이해를 위해 재생성하여 사용
         *  int i : 단순한 인덱스
         *  int cnt : 현재 정렬할 배열의 갯수
         *  int l : 왼쪽 시작 인덱스
         *  int r : 오른쪽 시작 인덱스
         */
        int[] tmp = new int[right + 1];
        int i = 0;
        int cnt = right - left;
        int l = left;
        int r = mid + 1;

        System.out.printf("%s left: %s mid: %s right: %s ", Arrays.toString(list), left, mid, right);

        // 현재 정렬할 배열이 임시 배열로 모두 담길때 까지 반복
        while (i <= cnt) {

            /**
             *  오른쪽 비교 인덱스가 더이상 없거나
             *  왼쪽 비교 인덱스가 아직 남아있고 오른쪽 인덱스 값보다 작으면
             *  임시배열에 담는다
             */
            if (r > right || l <= mid && list[l] < list[r]) {
                tmp[left+i] = list[l];
                l++;
            } else {
            /**
             *  오른쪽 인덱스값이 왼쪽 인덱스 값보다 작으면 임시배열에 담는다
             */
                tmp[left+i] = list[r];
                r++;
            }

            // 임시배열에 담았으므로 카운트 +1
            i++;
        }

        // 임시배열을 기존배열에 다시 복사한다.
        for (int j = left; j <= right; j++) {
            list[j] = tmp[j];
        }

        System.out.printf("%s \n", Arrays.toString(tmp));
    }

}
