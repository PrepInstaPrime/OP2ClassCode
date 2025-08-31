import java.util.Arrays;

public class MergeSort {
    static void divide (int nums[],int start, int end){
        if(start>=end){
            return;
        }
        int mid= start + (end-start)/2;
        // left array
        divide(nums, start, mid);  // step 1: nums=[3,5,4,2,1]
        // right array
        divide(nums, mid+1, end); // step 2: 
        // merge them 
        merge(nums, start, mid, end);

    }
    static void merge(int nums[], int start, int mid, int end){
        // step 1: merge(nums,0,0,1) // step 2: merge(nums, 0, 1, 2)
        int temp[]= new int[end-start+1];   //step: 1-> temp=[0,0] // step 2: temp=[0,0,0]
        int i=start;  // step 1: i=0 // step 2: i=0
        int j= mid+1; // step 1: j=0+1=1 // step 2: j=2
        int k=0;
        while (i<=mid&&j<=end) { // step 1a: 0<=0&& 1<=1 // step 1b: 0<=0 &&2<=1 (false)
            // step 2a: 0<=1&&2<=2 , step 2b: 1<=1&&2<=2 , step 2c: 1<=1&&3<=2(false)
            if(nums[i]<nums[j]){ // step 1a: 5<3 // step 2a: 3<4 // step 2b: 5<4 (false)
                temp[k]=nums[i]; // step 2a: temp=[3,0,0] 
                k++; // step 2a: k=1
                i++; // step 2a: i=1
            }else{
                temp[k]=nums[j]; // step 1a: temp=[3,0] // step 2b: temp=[3,4,0]
                k++;  // step 1a: k=1 // step 2b: k=2
                j++;  // step 1a: j=2 // step 2b; j=3
            }
        }
        while (i<=mid) { // step 1a: 0<=0 // step 1b: 1<=0 (false)
            // step 2a: 1<=1 , 2<=1 (false)
            temp[k]=nums[i]; // step 1a: temp=[3,5] // step 2a: temp=[3,4,5]
            k++;  // step 1a: k=2 // step 2a: k=3
            i++; // step 2a: i=1 // step 2a: i=2
        }
        while (j<=end) { // step 1: 2<=1 (false)// step 2: 3<=2 (false)
            temp[k]=nums[j];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(temp));
        // step 1a: 0<2, step 1b: 1<2
        // step 2a: 0<3, step 2b: 1<3, step 2c: 2<3
        for(int m=0;m<temp.length;m++){
            // step 1a: nums[3,3,4,2,1] // step 1b: nums=[3,5,4,2,1]
            //step 2a: nums=[3,5,4,2,1] // step 2b: nums=[3,4,4,2,1] // step 2c: nums=[3,4,5,2,1]
            nums[start+m]=temp[m];
        }

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
