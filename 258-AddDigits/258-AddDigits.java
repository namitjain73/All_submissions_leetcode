// Last updated: 8/28/2025, 2:50:43 AM
class Solution {
    public int addDigits(int num) {

    if (num == 0){
        return 0;
    }
    else if (num % 9 == 0){
        return 9;
    }
    else{
        return num % 9;

    }
    }
}