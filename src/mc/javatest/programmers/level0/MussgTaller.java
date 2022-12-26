/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : MussgTaller
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 머쓱이보다 키 큰 사람
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class MussgTaller {

    public static void main(String[] args) {
        MussgTaller mussgTaller = new MussgTaller();

        int[] array = {149, 180, 192, 170};
        int height = 167;

        System.out.println(mussgTaller.solution(array, height));
    }

    /**
     * 1 ≤ array 의 길이 ≤ 100
     * 1 ≤ height ≤ 200
     * 1 ≤ array 의 원소 ≤ 200
     */
    public int solution(int[] array, int height) {
        int answer = 0;

        for(int i : array){
            if(i > height) answer++;
        }

        return answer;
    }

}
