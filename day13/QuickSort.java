import java.util.Arrays;
public class QuickSort {
    static void divide(int nums[], int start, int end){
        if(start>=end){
            return;
        }
        int pivotIndex=findIndex(nums,start, end );
        divide(nums, start, pivotIndex-1);
        divide(nums, pivotIndex+1, end);
    }
    static int findIndex(int nums[], int start, int end){
        // step 1: findIndex(nums, 0, 4)
        // step2: findIndex(nums, 1, 4)
        // step 3: findIndex(nums, 1,3)
        int i=start-1; // step 1: i=-1 // step 2: i=0 // step 3: i=0
        int pivot=nums[end]; //step 1: pivot=1 // step 2: pivot=5 // step 3: pivot=2
        int j=start; // step 1a: j=0, 0<4, 1<4,2<4, 3<4,4<4
        // step 2: j=1, 1<4, 2<4, 3<4, 4<4
        // step 3: j=1, 1<3, 2<3, 3<3 (false)
        for(j=start;j<end;j++){
            //step 1:  5<=1, 3<=1, 4<=1, 2<=1
            // step 2: 3<=5, 4<=5,2<=5
            // step 3: 3<=2, 4<=2
            if(nums[j]<=pivot){
                i++; // step 2a: i=1 , 2b: i=2, 2c: i=3
                swap(nums, i,j);
                // step 2a: swap(nums, 1,1), 2b: swap(nums, 2,2), 2c: swap(nums, 3,3)
            }
        }
        swap(nums, i+1, j); 
        // step 1: swap(nums, 0,4)
        // step 2: swap (nums, 4,4)
        // step 3: swap (nums, 1,3)
        return i+1; // step 1: 0 // step 2: i=4 // step 3: i=1
    }
    static void swap(int nums[], int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        // step 1: nums=[1,3,4,2,5]
        // step 2a: nums=[1,3,4,2,5]
        // step 3: nums=[1,2,4,3,5]
    }
    public static void main(String[] args) {
        int nums[]={5,3,4,2,1};
        int start= 0;
        int end= nums.length-1;
        System.out.println("Before Sorting: "+ Arrays.toString(nums));
        divide(nums,start,end);
        System.out.println("After Sorting: "+ Arrays.toString(nums));

    }
}
