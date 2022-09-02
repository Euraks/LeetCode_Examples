/**
 * @author @Euraks 25.08.2022
 */
package first_part;

public class RomantoInteger {
    public static void main(final String[] params) {

        System.out.println(new RomantoInteger().romanToInt("III"));
        System.out.println(new RomantoInteger().romanToInt("LVIII"));
        System.out.println(new RomantoInteger().romanToInt("MCMXCIV"));
        System.out.println(new RomantoInteger().romanToInt("IIV"));
    }

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int rezultat = 0;
        for (int pozition = 0; pozition < chars.length; pozition++) {
            int prevDigital = (pozition - 1) >= 0 ? letterToDigit(chars[pozition - 1]) : letterToDigit(chars[pozition]);
            int currentDigital = letterToDigit(chars[pozition]);

            if (prevDigital < currentDigital) {
                rezultat = rezultat + (currentDigital - 2 * prevDigital);
            } else rezultat = rezultat + currentDigital;

        }
        return rezultat;
    }

    public int letterToDigit(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalStateException("Unexpected value: " + ch);
        };
    }
}


