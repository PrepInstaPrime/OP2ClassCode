
public class VariableSizeSliding {
    static int maxSubArray(int nums[],int target){
        int maxSub=0;
        int sum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>target){
                sum-=nums[left];
                left++;
            }
            if(sum==target){
                maxSub=Math.max(maxSub, right-left+1);
            }
        }
        return maxSub;
    }

    static int minSubArray(int nums[],int target){
        int minSub=nums.length+1;
        int sum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>target){
                sum-=nums[left];
                left++;
            }
            if(sum==target){
                minSub=Math.min(minSub, right-left+1);
            }
        }
        return minSub==nums.length+1?-1:minSub;
    }
    public static void main(String[] args) {
        // int arr[]={1,2,3,1,1,1,5,1,8,2};
        // int target=8;
        int arr[]={4,3,1,1,1,1,2,5,1,7};
        int target= 6;
        // System.out.println(maxSubArray(arr, target));
        System.out.println(minSubArray(arr, target));
    }
}
