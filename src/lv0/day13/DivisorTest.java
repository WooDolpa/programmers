package lv0.day13;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName : lv0.day13
 * className : DivisorTest
 * user : jwlee
 * date : 2022/12/01
 */
public class DivisorTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] results = solution.solution(24);
        Arrays.stream(results).forEach(System.out :: print);
    }

    /**
     * 약수 구하기
     *
     */
    public static class Solution {
        public int[] solution(int n) {
            boolean isValid = (1 <= n && n <= 10000);
            int[] answer = {};
            if(isValid) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i=1; i <= Math.sqrt(n); i++) {
                    if( n % i == 0) {
                        list.add(i);
                        if((n/i) != i) list.add((n/i));
                    }
                }
                answer = list.stream().sorted().mapToInt(Integer::intValue).toArray();
            }
            return answer;
        }
    }
}
