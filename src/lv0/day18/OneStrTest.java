package lv0.day18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * packageName : lv0.day18
 * className : OneStrTest
 * user : jwlee
 * date : 2022/12/09
 */
public class OneStrTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("abcabcadc"));
        System.out.println("abcabcadc".substring(7,8));
    }


    /**
     * 한 번만 등장한 문자
     *
     *         int[] alpha = new int[26];
     *         for(char c : s.toCharArray()){
     *             alpha[c - 'a']++;
     *         }
     *
     *         StringBuilder answer = new StringBuilder();
     *         for(int i = 0; i < 26; i++){
     *             if(alpha[i] == 1){
     *                 answer.append((char)(i + 'a'));
     *             }
     *         }
     *         return answer.toString();
     *
     */
    public static class Solution {
        public String solution(String s) {

            String answer = s;
            int sLen = s.length();
            Set<String> dpList = new HashSet<>();

            for (int i=0; i < sLen; i++) {
                String a = s.substring(i, i+1);
                for (int k = sLen-1; k > i; k--) {
                    String b = s.substring(k, k+1);
                    if(a.equals(b))
                        dpList.add(a);
                }
            }

            String newS = s;
            for (String dp : dpList) {
                newS = newS.replace(dp, "");
            }

            char[] newSArray = newS.toCharArray();
            Arrays.sort(newSArray);
            answer = new String(newSArray);

            return answer;
        }
    }
}
