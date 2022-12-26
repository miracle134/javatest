/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : NextNumber
 * author         : MiracleCat
 * date           : 2022-12-17
 * description    : 다음에 올 숫자
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-17        MiracleCat       최초 생성
 */
public class NextNumber {

    public static void main(String[] args) {
        NextNumber nextNumber = new NextNumber();

        int[] common = {1, 2, 3, 4};

        System.out.println(nextNumber.solution(common));
    }

    /**
     * 2 < common의 길이 < 1,000
     * -1,000 < common의 원소 < 2,000
     * 등차수열 혹은 등비수열이 아닌 경우는 없습니다.
     * 공비가 0인 경우는 없습니다.
     *
     * @param common
     * @return
     */
    public int solution(int[] common) {
        int answer = 0;

        int one = common[0];
        int two = common[1];
        int three = common[2];

        // 등차수열
        if (two - one == three - two) {

            answer = common[common.length-1] + (two - one);

        } else { // 등비 수열

            answer = common[common.length-1] * (two / one);

        }

        return answer;
    }

}
