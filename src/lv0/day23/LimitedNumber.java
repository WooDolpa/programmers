package lv0.day23;

import java.util.HashSet;

/**
 * packageName : lv0.day23
 * className : LimitedNumber
 * user : jwlee
 * date : 2022/12/22
 */
public class LimitedNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(7, 20));
        System.out.println(solution.solution(11, 22));
        System.out.println(solution.solution(12, 21));

    }

    /**
     * 유한소수 판별하기
     *
     */
    public static class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            boolean isValid = 0 < a && a <= 1000 && 0 < b && b <= 1000;

            if(isValid) {
                int gcd = gcd(a, b);
                int div_b = b / gcd;
                answer = factorization(div_b);
            }

            return answer;
        }

        private int gcd(int a, int b) {

            if(a <= b) {
                int temp = a;
                a = b;
                b = temp;
            }

            if (b == 0) {
                return a;
            }

            return gcd(b, a % b);
        }

        private int factorization(int number) {

            int result = 1;
            int a = number;
            HashSet<Integer> numSet = new HashSet<>();
            for (int i=2; i <= number; i++) {
                while (a%i == 0) {
                    numSet.add(i);
                    a /= i ;
                }
            }

            for (int num : numSet) {
                if(!(num == 2 || num == 5)) {
                    result = 2;
                    break;
                }
            }
            return result;
        }
    }

}
