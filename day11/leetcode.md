# Question : https://leetcode.com/problems/count-elements-with-maximum-frequency/ 
# solution: 
``` class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val:nums){
            map.put(val, map.getOrDefault(val,0)+1);
        }
        int max=0;
        for(int key:map.keySet()){
            max= Math.max(max, map.get(key));
        }
        int sum=0;
        for(int key:map.keySet()){
            if(map.get(key)==max){
                sum+=map.get(key);
            }
        }
        return sum;
    }
}
```