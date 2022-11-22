package lv0.day01;

/**
 * packageName : lv0
 * className : BabblingOne
 * user : jwlee
 * date : 2022/11/09
 */
public class BabblingOne {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("result : "+ solution.solution(new String[]{"aya","yee","u","maa","wyeoo"}));
        System.out.println("result : "+ solution.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }

    public static class Solution {

        public int solution(String[] babbling) {

            int answer = 0;
            String [] newBabbling = validateBabbling(babbling);

            for (String babble : newBabbling) {
                if(babble.length() >= 1 && babble.length() <= 15) {
                    if(isBabbling(babble)) answer++;
                }
            }

            return answer;
        }

        private String[] validateBabbling(String[] babbling) {
            if(babbling.length == 0 || babbling.length > 100) {
                return new String[0];
            }
            return babbling;
        }

        private boolean isBabbling(String babble) {

            String[] keywords = new String[]{"aya","ye","woo","ma"};
            String newBabble = babble;
            for (String keyword : keywords) {
                newBabble = keywordMatch(newBabble, keyword);
                if(newBabble.length() == 0) return true;
            }

            return false;
        }

        private String keywordMatch(String babble, String keyword) {
            if(babble.contains(keyword)) {

                int keywordIndex = babble.indexOf(keyword);

                if(keywordIndex == 0) {
                    return babble.substring(keyword.length());
                }

                if((keywordIndex + keyword.length()) == babble.length()) {
                    return babble.substring(0, keywordIndex);
                }

                String prefix = babble.substring(0, keywordIndex);
                String after = babble.substring((keywordIndex + keyword.length()));
                if(prefix.length() > 1 && after.length() > 1) {
                    return prefix+after;
                }
            }
            return babble;
        }

    }

}
