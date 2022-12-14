package lv0.day20;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName : lv0.day20
 * className : FactorizationTest
 * user : jwlee
 * date : 2022/12/13
 */
public class FactorizationTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = solution.solution(12);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    /**
     * 소인수분해
     *
     */
    public static class Solution {
        public int[] solution(int n) {
            boolean isLen = 2 <= n && n <= 10000;
            int[] answer = {};
            if(isLen) {
                int a = n;
                Set<Integer> list = new HashSet<>();
                for (int i=2; i <= Math.sqrt(n); i++) {
                    while (a % i == 0) {
                        list.add(i);
                        a /= i;
                    }
                }
                if(a != 1) list.add(a);
                answer = list.stream().sorted().mapToInt(i -> i).toArray();
            }
            return answer;
        }
    }
}
