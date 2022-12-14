package lv0.day20;

/**
 * packageName : lv0.day20
 * className : CalculatorString
 * user : jwlee
 * date : 2022/12/14
 */
public class CalculatorString {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("3 + 4"));
    }

    /**
     * 문자열 계산하기
     *
     */
    public static class Solution {
        public int solution(String my_string) {
            boolean isLen = 5 <= my_string.length() && my_string.length() <= 100;
            int answer = 0;
            if(isLen) {
                String[] string_split = my_string.split(" ");
                answer = Integer.parseInt(string_split[0]);
                for (int i=1; i < string_split.length; i++) {
                    if(i % 2 != 0) {
                        if("+".equals(string_split[i])) {
                            answer += Integer.parseInt(string_split[i+1]);
                        }else {
                            answer -= Integer.parseInt(string_split[i+1]);
                        }
                    }
                }
            }
            return answer;
        }
    }

//    String[] my_string_split = my_string.split(" ");
//            for (int i=0; i < my_string_split.length; i++) {
//        String s = my_string_split[i];
//        for (int k=0; k <calculations.length; k++) {
//            String calculation = calculations[k];
//            if(calculation.equals(s)) {
//                int a = Integer.parseInt(my_string_split[i-1]);
//                int b = Integer.parseInt(my_string_split[i+1]);
//                answer += k == 0 ? (a+b) : (a-b);
//            }
//        }
//    }
}
