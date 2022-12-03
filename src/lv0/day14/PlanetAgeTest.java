package lv0.day14;

/**
 * packageName : lv0.day14
 * className : PlanetAgeTest
 * user : jwlee
 * date : 2022/12/03
 */
public class PlanetAgeTest {

    public static void main(String[] args) {

    }

    /**
     * 외계행성나이
     * String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
     */
    public static class Solution {
        public String solution(int age) {
            boolean isValid = 0 <= age && age <= 1000;
            String answer = "";
            if(isValid) {
                String[] ageStrArray = new String[]{"a","b","c","d","e","f","g","h","i","j"};
                String ageStr = String.valueOf(age);
                for (int i =0; i<ageStr.length(); i++) {
                    int idx = Integer.parseInt(ageStr.substring(i,i+1));
                    answer += ageStrArray[idx];
                }

//                다른 풀이 방법
//                while(age>0){
//                    answer = ageStrArray[age % 10] + answer;
//                    age /= 10;
//                }
            }
            return answer;
        }
    }


}
