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
        System.out.println("result : "+ solution.solution(new String[]{"aya","yee","u","maa","wyeoo"}));

//        String test = "wyeoo";
//        String[] splitStr = test.split("ye");
//        for (String str : splitStr) {
//            System.out.println("..... : "+ str.trim() + "|" + str.trim().length());
//        }

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
            String test = babble;
            for (String keyword : keywords) {
                test = splitKeyword(test, keyword);
                if(test.length() == 0) break;
            }

            if(test.length() == 0) return true;
            return false;
        }

        private String splitKeyword(String text, String keyword) {

            String result = "";

            int count = 0;
            String[] splitStrings = text.split(keyword);

            if(splitStrings.length == 0) return "";

            for (String splitString : splitStrings) {
                if(splitString.length() > 1) {
                    count++;
                    result = splitString;
                }
            }

            if(count == 1) {
                return  result;
            }

            return text;
        }
    }

}
