/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : SmallSubstring
 * author         : MiracleCat
 * date           : 2023-01-04
 * description    : 크기가 작은 부분 문자열
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-04        MiracleCat       최초 생성
 */
public class SmallSubstring {

    public static void main(String[] args) {
        SmallSubstring smallSubstring = new SmallSubstring();

        String t = "3141592";
        String p = "271";

        System.out.println(smallSubstring.solution(t, p));
    }

    /**
     * 1 ≤ p의 길이 ≤ 18
     * p의 길이 ≤ t의 길이 ≤ 10,000
     * t와 p는 숫자로만 이루어진 문자열이며, 0으로 시작하지 않습니다.
     */
    public int solution(String t, String p) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();
        int tot = t.length();
        int pivot = p.length();
        long comInt = Long.parseLong(p);


        for (int i = 0; i < tot - (pivot - 1); i++) {
            if (i == 0) {
                for (int j = 0; j < pivot; j++) {
                    sb.append(t.charAt(j));
                }
            } else {
                sb.deleteCharAt(0);
                sb.append(t.charAt(i + pivot - 1));
            }

            System.out.printf("%s %s\n", sb, comInt);
            if (Long.parseLong(sb.toString()) <= comInt) answer++;
        }

        return answer;
    }

}
