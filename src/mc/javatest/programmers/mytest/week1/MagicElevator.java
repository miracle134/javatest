package mc.javatest.programmers.mytest.week1;

public class MagicElevator {

    public static void main(String[] args) throws Exception {
        MagicElevator magicElevator = new MagicElevator();

        int storey = 950045000;

        System.out.println("리턴 값 : " + magicElevator.solution(storey));

    }

    public int solution(int storey) {
        int answer = 0;

        /**
         * 1. X < 5 : 빼기 X >= 5 : 더하기
         * 2. 현재값이 5이고 다음값이 4이하면 : 빼기
         * 3. 마지막이이면 X <= 5 : 빼고 X > 5 : 더하기
         */
        String s = String.valueOf(storey);
        int[] store = new int[s.length()];

        for (int i = 0; i < store.length; i++) {
            store[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        for (int i = 0; i < store.length; i++) {
            int tmp = store[store.length - 1 - i];

            System.out.println(tmp);

            if (i == store.length - 1) { // 마지막

                if (tmp <= 5) {
                    answer += tmp;
                } else {
                    answer += 11 - tmp;
                }

            } else {

                if (tmp < 5) {
                    answer += tmp;
                } else {
                    int nextTmp = store[store.length - 2 - i];

                    if (tmp == 5 && nextTmp <= 4) {
                        answer += tmp;
                    } else {
                        answer += 10 - tmp;
                        store[store.length - 2 - i] += 1;
                    }
                }

            }

        }

        return answer;
    }

}
