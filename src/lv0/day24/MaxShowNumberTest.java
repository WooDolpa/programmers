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

    }

    public static class Solution {
        public int solution(int[] array) {
            int answer = 0;
            boolean isLen = 0 < array.length && array.length < 100;
            if(isLen) {
                HashMap<Integer, Integer> map = new HashMap<>();
                for (int n : array) {
                    int count = map.get(n);
                    if(count == 0) {
                        map.put(n, 1);
                    }else{
                        count++;
                        map.put(n, count);
                    }
                }

                for (int key : map.keySet()) {

                }
            }
            return answer;
        }
    }
}
