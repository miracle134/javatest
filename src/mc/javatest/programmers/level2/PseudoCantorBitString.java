/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level2;

/**
 * packageName    : mc.javatest.programmers.level2
 * fileName       : PseudoCantorBitString
 * author         : MiracleCat
 * date           : 2023-01-01(001)
 * description    : 유사 칸토어 비트열
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-01(001)        MiracleCat       최초 생성
 */
public class PseudoCantorBitString {

    public static void main(String[] args) {
        PseudoCantorBitString pseudoCantorBitString = new PseudoCantorBitString();
        String a = "1101111011000001101111011";

        int n = 20;
        int l = 4;
        int r = 17;

        System.out.println(pseudoCantorBitString.solution(n, l, r));
    }

    /**
     * 1 ≤ n ≤ 20
     * 1 ≤ l, r ≤ 5n
     * l ≤ r < l + 10,000,000
     * l과 r은 비트열에서의 인덱스(1-base)이며 폐구간 [l, r]을 나타냅니다.
     */
    public int solution(int n, long l, long r) {
        int answer = 0;

        // 최초 값
        String curValue = "1";

        // n만큼 반복
        for (int i = 0; i < n; i++){
            curValue = curValue.replaceAll("0", "00000");
            curValue = curValue.replaceAll("1", "202");
        }



//        for(long i = l-1; i < r; i++){
//            if(curValue.charAt((int)i) == '1') answer++;
//        }

        return answer;
    }

}
