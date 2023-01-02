package lv0.day24;

/**
 * packageName : lv0.day24
 * className : NextNumberTest
 * user : jwlee
 * date : 2022/12/29
 */
public class NextNumberTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1,2,3,4}));
        System.out.println(solution.solution(new int[]{2,4,8}));
    }

    /**
     * 다음에 올 숫자
     *
     */
    public static class Solution {
        public int solution(int[] common){
            int answer = 0;
            boolean isLen = 2 < common.length && common.length < 1000;
            if(isLen){
                int a,b,c = 0;
                a = common[0];
                b = common[1];
                c = common[2];
                if((b-a) == (c-b)) {
                    // 공차
                    answer = common[common.length-1] + (b-a);
                }else{
                    // 공비
                    answer = common[common.length-1] * (b/a);
                }
            }
            return answer;
        }
    }
}
