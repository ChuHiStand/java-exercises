//    Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//    For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

public class SquareDigit {

    public static int squareDigits(int n) {
        String stringResult = "";
        char[] strArray = ("" + n).toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            int stringToNum = Integer.parseInt(String.valueOf(strArray[i]));
            stringResult += (stringToNum * stringToNum);
        }
        n = Integer.parseInt(stringResult);
        return n;
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
}