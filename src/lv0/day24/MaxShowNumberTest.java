package lv0.day24;

import java.util.HashMap;

/**
 * packageName : lv0.day24
 * className : MaxShowNumberTest
 * user : jwlee
 * date : 2022/12/26
 */
public class MaxShowNumberTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1,2,3,3,3,4}));
        System.out.println(solution.solution(new int[]{1,1,2,2}));
    }

    /**
     * 최빈값 구하기
     * 베스트 풀이 --> 내가 구현한 for문 두개를 한개로 줄여서 사용함
     *
     */
    public static class Solution {
        public int solution(int[] array) {
            int answer = 0;
            boolean isLen = 0 < array.length && array.length < 100;
            if(isLen) {
                HashMap<Integer, Integer> map = new HashMap<>();
                for (int n : array) {
                    if(!map.containsKey(n)) {
                        map.put(n, 1);
                    }else{
                        int count = map.get(n);
                        count++;
                        map.put(n, count);
                    }
                }

                int max = 0;
                int count = 0;
                boolean isMatch = false;

                for (int key : map.keySet()) {
                    int value = map.get(key);
                    if(value >= count) {
                        isMatch = false;
                        if(value == count) isMatch = true;
                        count = value;
                        max = key;
                    }
                }
                if(isMatch) return -1;
                answer = max;
            }
            return answer;
        }
    }
}
