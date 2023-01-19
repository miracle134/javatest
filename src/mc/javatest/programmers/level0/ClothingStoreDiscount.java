/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : ClothingStoreDiscount
 * author         : MiracleCat
 * date           : 2023-01-19
 * description    : 옷가게 할인 받기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-19        MiracleCat       최초 생성
 */
public class ClothingStoreDiscount {

    public static void main(String[] args) {
        SevenCount sevenCount = new SevenCount();

        int[] array = {7, 77, 17};

        System.out.println(sevenCount.solution(array));
    }

    /**
     * 10 ≤ price ≤ 1,000,000
     * price 는 10원 단위로(1의 자리가 0) 주어집니다.
     * 소수점 이하를 버린 정수를 return 합니다.
     */
    public int solution(int price) {
        int answer;

        if (price >= 500000) { // 50만원
            answer = (int) (price - price * 0.2);
        } else if (price >= 300000) { // 30만원
            answer = (int) (price - price * 0.1);
        } else if (price >= 100000) { // 10만원
            answer = (int) (price - price * 0.05);
        } else {
            answer = price;
        }

        return answer;
    }

}
