package lv0.day24;

/**
 * packageName : lv0.day24
 * className : OXQuizTest
 * user : jwlee
 * date : 2022/12/28
 */
public class OXQuizTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        String[] answers = solution.solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"});
        String[] answers = solution.solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});
        for (String answer : answers) {
            System.out.println(answer);
        }
    }

    /**
     * OX 퀵즈
     *
     */
    public static class Solution {
        public String[] solution(String[] quiz) {
            String[] answer = {};
            boolean isLen = 1 <= quiz.length && quiz.length <= 10;
            if(isLen) {
                answer = new String[quiz.length];

                for (int i=0; i < quiz.length; i++) {
                    String[] formulas = quiz[i].split(" ");
                    int x = Integer.parseInt(formulas[0]);
                    int y = Integer.parseInt(formulas[2]);
                    int z = Integer.parseInt(formulas[4]);
                    String operator = formulas[1];
                    if("+".equals(operator)) {
                        answer[i] = x+y == z ? "O" : "X";
                    }else{
                        answer[i] = x-y == z ? "O" : "X";
                    }
                }
            }
            return answer;
        }
    }
}
