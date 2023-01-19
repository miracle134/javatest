/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : TriadFlip
 * author         : MiracleCat
 * date           : 2023-01-18
 * description    : 3진법 뒤집기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-18        MiracleCat       최초 생성
 */
public class TriadFlip {

    public static void main(String[] args) {
        TriadFlip triadFlip = new TriadFlip();

        int n = 45;

        System.out.println(triadFlip.solution(n));
    }

    /**
     * n은 1 이상 100,000,000 이하인 자연수입니다.
     */
    public int solution(int n) {

        String threeJin = parseTenToThreeReverse(n); // 10진법 to 3진법 역전

        System.out.println(threeJin);

        return parseThreeToTen(threeJin);
    }

    private String parseTenToThreeReverse(int k){
        String threeJin = "";

        while(k > 2){
            threeJin += k % 3;
            k = k / 3;
        }

        threeJin += k;

        return threeJin;
    }

    private int parseThreeToTen(String k){
        int tenJin = 0;

        for(int i = 0; i < k.length(); i++){

            if(k.charAt(i) != 0)
                tenJin += Math.pow(3, k.length() - 1 - i)
                        * Integer.parseInt(String.valueOf(k.charAt(i)));

        }

        return tenJin;
    }

}
