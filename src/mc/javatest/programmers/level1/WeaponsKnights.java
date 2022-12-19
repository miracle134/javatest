/**
 * MiracleCat Project
 * Copyright 2016 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : WeaponsKnights
 * author         : MiracleCat
 * date           : 2022-12-17(017)
 * description    : 기사단원의 무기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-17(017)        MiracleCat       최초 생성
 */
public class WeaponsKnights {

    public static void main(String[] args) {
        WeaponsKnights weaponsKnights = new WeaponsKnights();

        int number = 5;
        int limit = 3;
        int power = 2;

        System.out.println(weaponsKnights.solution(number, limit, power));
    }

    /**
     * 1 ≤ number ≤ 100,000
     * 2 ≤ limit ≤ 100
     * 1 ≤ power ≤ limit
     *
     * @param number
     * @param limit
     * @param power
     * @return
     */
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int tmp = getNumber(i);

            if (tmp > limit) tmp = power;

            answer += tmp;
        }

        return answer;
    }

    public int getNumber(int n) {
        // 약수 구하기
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) count++;
            else if (n % i == 0) count += 2;
        }

        return count;
    }

}
