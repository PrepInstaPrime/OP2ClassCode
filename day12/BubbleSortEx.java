import java.util.Arrays;
public class BubbleSortEx {
    static void sort(int nums[]){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={5,3,4,2,1};
        System.out.println("Before Sorting: "+ Arrays.toString(nums));
        sort(nums);
        System.out.println("After Sorting: "+ Arrays.toString(nums));

    }
}
