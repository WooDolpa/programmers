package lv0;

import java.util.stream.IntStream;

/**
 * packageName : lv0
 * className : BabblingOne
 * user : jwlee
 * date : 2022/11/09
 */
public class BabblingOne {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println("result : "+ solution.solution(new String[]{"aya","yee","u","maa","wyeoo"}));
//        System.out.println("result : "+ solution.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));


//        String test = "yemawoo";
//        String[] keywords = {"ma","ye","woo"};
//
//        for (String keyword : keywords) {
//            if(test.contains(keyword)) {
//
//                int stringIdx = test.indexOf(keyword);
//                String newStr = test.substring(keyword.length());
//                if(stringIdx > 0) {
//                    newStr = test.substring(0, stringIdx);
//                    newStr += test.substring(stringIdx+keyword.length());
//                }
//                test = newStr;
//            }
//        }
        String[] samples = "wyeoo".split("ye");
        System.out.println(samples[0] + samples[1]);

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
//            String target = babble;
//            for (String keyword : keywords) {
//                target = keywordMatch(target, keyword);
//                if(target.length() == 0) return true;
//            }

            return false;
        }


        private String keywordMatch(String target, String keyword) {

//            if(target.contains(keyword)) {
//
//                int keywordIndex = target.indexOf(keyword);
//                String newStr = target.substring(keyword.length());
//                if(keywordIndex > 0) {
//                    newStr = target.substring(0, keywordIndex);
//                    newStr += target.substring(keywordIndex + keyword.length());
//                }
//
//                return newStr;
//            }

            return target;
        }

    }

}
