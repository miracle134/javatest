/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : CalculatingShortfall
 * author         : MiracleCat
 * date           : 2023-01-17
 * description    : 부족한 금액 계산하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-17        MiracleCat       최초 생성
 */
public class CalculatingShortfall {

    public static void main(String[] args) {
        CalculatingShortfall calculatingShortfall = new CalculatingShortfall();

        int price = 3;
        int money = 20;
        int count = 4;

        System.out.println(calculatingShortfall.solution(price, money, count));
    }

    /**
     * 놀이기구의 이용료 price : 1 ≤ price ≤ 2,500, price 는 자연수
     * 처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money 는 자연수
     * 놀이기구의 이용 횟수 count : 1 ≤ count ≤ 2,500, count 는 자연수
     */
    public long solution(int price, int money, int count) {
        long tot = money;
        for (int i = 1; i <= count; i++) {
            tot -= (long) price * i;
        }

        return tot >= 0 ? 0 : tot * -1;
    }

}
