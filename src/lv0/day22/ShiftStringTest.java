package lv0.day22;

/**
 * packageName : lv0.day22
 * className : ShiftStringTest
 * user : jwlee
 * date : 2022/12/21
 */
public class ShiftStringTest {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.solution("hello", "ohell"));
        System.out.println(solution.solution("apple", "elppa"));
    }

    /**
     * 문자열 밀기
     * String tempB = B.repeat(3);
     * return tempB.indexOf(A);
     *
     */
    public static class Solution {
        public int solution(String A, String B) {

            int answer = 0;
            boolean isLen = 0 < A.length() && A.length() < 100 && A.length() == B.length();
            if(isLen) {
                answer = -1;
                String s = A;
                for (int i=0; i < A.length(); i++) {

                    if(i == 0) {
                        if(s.equals(B)){
                            answer = 0;
                            break;
                        }
                    }else{
                        s = shiftRight(s);
                        if(B.equals(s)) {
                            answer = i;
                            break;
                        }
                    }
                }
            }
            return answer;
        }

        private String shiftRight(String s) {
            char[] sArray = s.toCharArray();
            for (int i = sArray.length-1 ; i > 0; i--) {
                char temp = sArray[i];
                sArray[i] = sArray[i-1];
                sArray[i-1] = temp;
            }
            return new String(sArray);
        }
    }

}
