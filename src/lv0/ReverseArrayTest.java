package lv0;

import java.util.Arrays;

/**
 * packageName : lv0
 * className : ReverseArrayTest
 * user : jwlee
 * date : 2022/11/21
 */
public class ReverseArrayTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1,2,3,4,5}));
        System.out.println(solution.solution(new int[]{1,1,1,1,1,2}));
        System.out.println(solution.solution(new int[]{1,0,1,1,1,3,5}));
    }

    /**
     * 배열 뒤집기
     *
     */
    public static class Solution {

        public int[] solution(int[] num_list) {
            boolean isValid = (1 <= num_list.length && num_list.length <= 1000);
            int[] answer = {};
            if(isValid) {
                answer = Arrays.stream(num_list).filter(i -> {
                    boolean result = (0 <= i && i <= 1000);
                    return result;
                }).toArray();

                int count = (answer.length/2) + (answer.length%2);
                for (int i =0; i <= count; i++) {
                    if(i != count) {
                        int temp = answer[i];
                        int b = answer[answer.length-1-i];
                        answer[i] = b;
                        answer[answer.length-1-i] = temp;
                    }
                }
            }
            return answer;
        }

    }

    //  List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());
    //
    //        Collections.reverse(list);
    //        return list.stream().mapToInt(Integer::intValue).toArray();
}
