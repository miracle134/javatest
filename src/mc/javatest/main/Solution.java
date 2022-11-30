package mc.javatest.main;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int[] a = {3, 8, 2, 7, 4, 5, 1, 6, 9};

//        System.out.println("리턴 값 : " + solution.solution(a,b));
        System.out.println("리턴 값 : " + Arrays.toString(solution.solution(a)));

    }

    public int[] solution(int[] arr) {
        int tmp;

        for (int i = 0; i < arr.length-1; i++) {
            int j = i;

            while (j >= 0 && arr[j]>arr[j+1]){
                tmp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = tmp;

                j--;
            }

        }

        return arr;
    }


}
