package lv0.day24;

/**
 * packageName : lv0.day24
 * className : PolinomialTest
 * user : jwlee
 * date : 2022/12/27
 */
public class PolinomialTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("3x + 7 + x"));
        System.out.println(solution.solution("x + x + x"));
    }

    /**
     * 다항식 더하기
     *
     */
    public static class Solution {
        public String solution(String polynomial) {
            String answer = "";
            String[] pns = polynomial.split(" ");

            String x = "";
            String operator = "";
            String number = "";

            for (String pn : pns) {
                int type = checkType(pn);
                switch (type) {
                    case 1:
                        if("".equals(x)) {
                            x = pn;
                        }else{
                            int xNumber = x.length() == 1 ? 1 : Integer.parseInt(x.substring(0, x.length()-1));
                            int pnNumber = pn.length() == 1 ? 1 : Integer.parseInt(pn.substring(0, pn.length()-1));
                            x = String.valueOf(xNumber+pnNumber).concat("x");
                            operator = "";
                        }
                        break;
                    case 2:
                        operator = pn;
                        break;
                    case 3:
                        if("".equals(number)) {
                            number = pn;
                        }else {
                            int nNumber = Integer.parseInt(number);
                            int pnNumber = Integer.parseInt(pn);
                            number = String.valueOf(nNumber + pnNumber);
                            operator = "";
                        }
                        break;
                    default:
                        break;
                }
            }

            StringBuilder sb = new StringBuilder();
            if(!"".equals(x) && !"".equals(number)) {
                sb.append(x).append(" + ").append(number);
            }else if(!"".equals(x) && "".equals(number)) {
                sb.append(x);
            }else if("".equals(x) && !"".equals(number)) {
                sb.append(number);
            }else{
                sb.append("");
            }

            return sb.toString();
        }

        private int checkType(String a) {
            if(a.contains("x")) {
                return 1;
            }else if("+".equals(a)) {
                return 2;
            }else{
                return 3;
            }
        }
    }
}
