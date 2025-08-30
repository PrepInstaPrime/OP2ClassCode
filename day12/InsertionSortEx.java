import java.util.Arrays;
public class InsertionSortEx {
    static void sort(int nums[]){
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            int key=i+1;
            int idx=i;
            while(idx>=0&&nums[key]<nums[idx]){
                nums[idx+1]=nums[idx];
                idx--;
            }
            nums[idx+1]=key;
        }
    }
    public static void main(String[] args) {
        int nums[]={5,3,4,2,1};
        System.out.println("Before Sorting: "+ Arrays.toString(nums));
        sort(nums);
        System.out.println("After Sorting: "+ Arrays.toString(nums));
    }
}
