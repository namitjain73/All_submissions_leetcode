// Last updated: 8/28/2025, 2:50:05 AM
import java.math.*;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger c = a.add(b);
        return c.toString();
        
    }
}