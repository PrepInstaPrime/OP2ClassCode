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

# Question : https://leetcode.com/problems/majority-element/description/
# Solution:
```
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int val:nums){
            map.put(val, map.getOrDefault(val,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>nums.length/2){
                return key;
            }
           
        }
        return 0;
    }
}
```


# Question: https://leetcode.com/problems/buddy-strings/ 
```
class Solution {
    public boolean buddyStrings(String s, String goal) {
        int sLen=s.length();
        int gLen= goal.length();
        if(sLen!=gLen){
            return false;
        }
        HashMap<Character, Integer> map1= new HashMap<>();
        HashMap<Character, Integer> map2= new HashMap<>();
    
        for(char c:s.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        for(char c:goal.toCharArray()){
            map2.put(c, map2.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(!map2.containsKey(c)||!map2.get(c).equals(map1.get(c))){
                return false;
            }
        }
        int count=0;
        for(int i=0;i<sLen;i++){
            if(s.charAt(i)!=goal.charAt(i)){
                count++;
                if(count>2){
                    return false;
                }
            }
        }
        if(count==0){
          for(char c:s.toCharArray()){
          if(map1.get(c)>=2){
                return true;
          }
          }
        }
        return count==2?true:false;
    }
}
```