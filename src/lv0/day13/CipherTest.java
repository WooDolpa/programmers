package lv0.day13;

/**
 * packageName : lv0.day13
 * className : CipherTes
 * user : jwlee
 * date : 2022/12/02
 */
public class CipherTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("dfjardstddetckdaccccdegk", 4));
    }

    /**
     * 암호해독
     *
     */
    public static class Solution {
        public String solution(String cipher, int code) {

            boolean isValidCipher = (1 <= cipher.length() && cipher.length() <= 1000);
            boolean isValidCode = 1 <= code && code <= cipher.length();
            String answer = "";

            if(isValidCipher && isValidCode) {
                for (int i=1; i <= (cipher.length()/code); i++) {
                    int idx = code * i;
                    answer += cipher.substring(idx-1,idx);
                }
            }
            return answer;
        }
    }
}
