package lv0.day09;

/**
 * packageName : lv0.day09
 * className : SimilarArrayTest
 * user : jwlee
 * date : 2022/11/27
 */
public class SimilarArrayTest {
    public static void main(String[] args) {

    }

    /**
     * 배열의 유사도
     *
     */
    public static class Solution {
        public int solution(String[] s1, String[] s2) {
            boolean isValidLen = (1 <= s1.length && s1.length <= 100) && (1 <= s2.length && s2.length <= 100);
            boolean isValid = isValidLen && validateIndexLength(s1) && validateIndexLength(s2);
            int answer = 0;
            if(isValid) {
                for (String str1 : s1) {
                    if(containStringToArray(str1, s2))
                        answer++;
                }
            }
            return answer;
        }

        private boolean validateIndexLength(String[] strArray) {
            for (String str : strArray) {
                if(!(1 <= str.length() && str.length() <= 10)) return false;
            }
            return true;
        }

        private boolean containStringToArray(String str, String[] array) {
            for (String s1 : array) {
                if(str.equals(s1))
                    return true;
            }
            return false;
        }
    }
}
