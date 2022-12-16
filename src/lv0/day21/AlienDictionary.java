package lv0.day21;

/**
 * packageName : lv0.day21
 * className : AlienDictionary
 * user : jwlee
 * date : 2022/12/15
 */
public class AlienDictionary {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
    }

    /**
     * 외계어 사전
     *
     */
    public static class Solution {
        public int solution(String[] spell, String[] dic){
            int answer = 0;

            int spellLen = spell.length;
            for (String d : dic) {
                if(d.length() == spellLen && isDictionary(spell, d)) {
                    answer = 1;
                    break;
                }
            }

            return answer;
        }

        private boolean isDictionary(String[] spells, String dic) {

            boolean isValid = true;

            for (String spell : spells) {
                if(dic.indexOf(spell) == -1) {
                    isValid = false;
                    break;
                }
            }

            return isValid;
        }

    }
}