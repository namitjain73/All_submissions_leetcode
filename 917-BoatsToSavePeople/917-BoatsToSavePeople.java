// Last updated: 8/28/2025, 2:48:46 AM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count= 0 ;
        int start = 0;
        int end = people.length-1;
        while(start < end){
            if(people[end] == limit){
                count++;
                end--;
            }
            else{
                int sum = people[start] + people[end];
                if(sum == limit){
                    end--;
                    start++;
                    count++;
                }
                else if(sum > limit){
                    end--;
                    count++;
                }
                else{
                    end--;
                    start++;
                    count++;
                }
            }
        }
        if(end == start && people[end] <= limit) count++;
        return count;
    }
}