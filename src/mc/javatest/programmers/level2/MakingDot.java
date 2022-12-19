package mc.javatest.programmers.level2;

public class MakingDot {

    public static void main(String[] args) {
        MakingDot makingDot = new MakingDot();

        int k = 2;
        int d = 6;

        System.out.println(makingDot.solution(k, d));
    }

    /**
     * 1 ≤ k ≤ 1,000,000
     * 1 ≤ d ≤ 1,000,000
     *
     * @param k
     * @param d
     * @return
     */
    public long solution(int k, int d) {
        long answer = 0;

        // d^2 = x^2 + y^2
        // y^2 = x^2 - d^2
        for (int i = 0; i <= d; i += k) {
            long ii = (long) Math.pow(i, 2);
            long dd = (long) Math.pow(d, 2);
            answer += (int)(Math.sqrt(dd - ii) / k) + 1;
        }

        return answer;
    }

}
