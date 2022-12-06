package lv0.day16;

import java.util.HashMap;

/**
 * packageName : lv0.day16
 * className : MorseCodeTest
 * user : jwlee
 * date : 2022/12/06
 */
public class MorseCodeTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(".... . .-.. .-.. ---"));
    }

    /**
     * 모스부호 (1)
     *
     */
    public static class Solution {
        public String solution(String letter) {

            String answer = "";
            HashMap<String, String> codeMap = new HashMap<>();
            codeMap.put(".-","a");
            codeMap.put("-...","b");
            codeMap.put("-.-.", "c");
            codeMap.put("-..", "d");
            codeMap.put(".", "e");
            codeMap.put("..-.", "f");
            codeMap.put("--.", "g");
            codeMap.put("....", "h");
            codeMap.put("..", "i");
            codeMap.put(".---", "j");
            codeMap.put("-.-", "k");
            codeMap.put(".-..","l");
            codeMap.put("--", "m");
            codeMap.put("-.","n");
            codeMap.put("---", "o");
            codeMap.put(".--.", "p");
            codeMap.put("--.-", "q");
            codeMap.put(".-.", "r");
            codeMap.put("...", "s");
            codeMap.put("-", "t");
            codeMap.put("..-","u");
            codeMap.put("...-", "v");
            codeMap.put(".--", "w");
            codeMap.put("-..-", "x");
            codeMap.put("-.--", "y");
            codeMap.put("--..", "z");

            String[] letterSplit = letter.split(" ");
            for (String str : letterSplit) {
                System.out.println(str);
                answer += codeMap.get(str);
            }

            return answer;
        }
    }
}
