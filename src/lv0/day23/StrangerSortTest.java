package lv0.day23;

/**
 * packageName : lv0.day23
 * className : StrangerSortTest
 * user : jwlee
 * date : 2022/12/23
 */
public class StrangerSortTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = solution.solution(new int[]{1,2,3,4,5,6}, 4);
        int[] nums = solution.solution(new int[]{10000,20,36,47,40,6,10,7000}, 30);
        for (int num : nums) {
            System.out.print(num+" | ");
        }
    }

    /**
     * 특이한 정렬
     *
     */
    public static class Solution {
        public int[] solution(int[] numlist, int n) {

            int[] answer = {};
            boolean isLen = 1 <= numlist.length && numlist.length <= 100;
            boolean isValid = 1 <= n && n <= 10000;

            if(isLen && isValid) {

                answer = numlist;
                for (int i=0; i < answer.length; i++) {

                    if(answer[i] == n) continue;

                    for (int k=i+1; k < answer.length; k++) {

                        int a = answer[i];
                        int b = answer[k];
                        boolean isChange = b == n;
                        if(!isChange) {
                            isChange = (Math.abs(a-n) > Math.abs(b-n)) ||(Math.abs(a-n) == Math.abs(b-n) && b > a);
                        }

                        if(isChange) {
                            int temp = answer[i];
                            answer[i] = answer[k];
                            answer[k] = temp;
                        }
                    }
                }
            }
            return answer;
        }
    }

}
