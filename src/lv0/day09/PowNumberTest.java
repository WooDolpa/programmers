package lv0.day09;

/**
 * packageName : lv0.day09
 * className : PowNumberTest
 * user : jwlee
 * date : 2022/11/27
 */
public class PowNumberTest {
    public static void main(String[] args) {

    }

    /**
     * 제곱수 판별하기
     *
     * n % Math.sqrt(n) == 0
     *
     */
    public static class Solution {
        public int solution(int n) {
            boolean isValid = (1 <= n && n <= 1000000);
            int answer = 0;
            if(isValid) {
                int a = 1;
                answer = 2;

                while (true) {
                    if( (a*a) >= n)  break;
                    a++;
                }
                if((a*a) == n) {
                    answer = 1;
                }
            }
            return answer;
        }
    }
}
