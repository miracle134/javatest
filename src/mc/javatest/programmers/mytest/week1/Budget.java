package mc.javatest.programmers.mytest.week1;

import java.util.Arrays;

public class Budget {

    public static void main(String[] args) throws Exception {
        Budget budgets = new Budget();

        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;

        System.out.println("리턴 값 : " + budgets.solution(d, budget));

    }

    public int solution(int[] d, int budget) {
        int answer = 0;

        // 부서 신청금액 정렬
        Arrays.sort(d);

        // 예산에서 차감
        for (int i : d) {
            if (budget - i >= 0) {
                budget -= i;
                answer++;
            }else{
                break;
            }
        }

        return answer;
    }

}
