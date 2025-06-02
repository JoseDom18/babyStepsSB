import java.util.Map;
import java.util.HashMap;

class Solution {
    public static int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        char[] arrayValores = s.toCharArray();
        Integer limite = s.length();
        Integer ultimoChar = 1;
        Integer decimal = 0;

        for (int i = limite - 1; i >= 0; i--) {
           Integer actualChar = roman.get(arrayValores[i]);
           
            if (ultimoChar > actualChar) {
                decimal -= actualChar;
            } else {
                decimal += actualChar;
            }
            
            ultimoChar = roman.get(arrayValores[i]);
        }
        return decimal;
        
    }
}
