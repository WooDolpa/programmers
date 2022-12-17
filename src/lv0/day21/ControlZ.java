package lv0.day21;

import java.util.ArrayList;

/**
 * packageName : lv0.day21
 * className : ControlZ
 * user : jwlee
 * date : 2022/12/16
 */
public class ControlZ {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("1 2 Z 3"));
        System.out.println(solution.solution("10 20 30 40"));
        System.out.println(solution.solution("10 Z 20 Z 1"));
        System.out.println(solution.solution("-1 -2 -3 Z"));
    }

    /**
     * 컨트롤 제트
     *
     */
    public static class Solution{
        public int solution(String s) {
            int answer = 0;
            String[] sArray = s.split(" ");
            ArrayList<Integer> numList = new ArrayList<>();
            for (String si : sArray) {
                if("Z".equals(si)){
                    numList.remove(numList.size()-1);
                }else{
                    numList.add(Integer.parseInt(si));
                }
            }

            for (int num : numList) {
                answer += num;
            }
            return answer;
        }
    }
}
