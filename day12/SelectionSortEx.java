import java.util.Arrays;
public class SelectionSortEx {
    static void sort(int nums[]){
        int n= nums.length;
        for(int i=0;i<n;i++){
            int minIdx=i;
            // find the minimum value's index
            for(int j=i+1;j<n;j++){
                if(nums[minIdx]>nums[j]){
                    minIdx=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[minIdx];
            nums[minIdx]=temp;

        }
    }
    public static void main(String[] args) {
        int nums[]={5,3,4,2,1};
        System.out.println("Before Sorting: "+ Arrays.toString(nums));
        sort(nums);
        System.out.println("After Sorting: "+ Arrays.toString(nums));
    }
}
