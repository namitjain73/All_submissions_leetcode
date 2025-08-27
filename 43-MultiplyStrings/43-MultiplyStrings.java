// Last updated: 8/28/2025, 2:52:39 AM
import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n = new BigInteger(num1);
        BigInteger m = new BigInteger(num2);
        BigInteger ans = m.multiply(n);
        return ans.toString();
        
    }
}