public class SquareDigit {

    public static int squareDigits(int n) {
        String stringResult = "";
        char[] strArray = ("" + n).toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            int stringToNum = Integer.parseInt(String.valueOf(strArray[i]));
            stringResult = stringResult + (stringToNum * stringToNum);
        }
        n = Integer.parseInt(stringResult);
        return n;
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
}