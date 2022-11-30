package lv0.day11;



/**
 * packageName : lv0.day11
 * className : GermIncreaseTest
 * user : jwlee
 * date : 2022/11/30
 */
public class GermIncreaseTest {

    public static void main(String[] args) {
        System.out.println(2 << 3);
    }

    /**
     * 세균 증식
     * 비트연산자 풀이.... 확인해보기
     * (n << t) 한줄 ....
     */
    public static class Solution {
        public int solution(int n, int t) {
            boolean isValid = (1 <= n && n <= 10) && (1 <= t && t <= 15);
            int answer = 0;
            if(isValid) {
                answer = n;
                for (int i =1; i <= t; i++) {
                    answer = answer * 2;
                }
            }
            return answer;
        }
    }

}
