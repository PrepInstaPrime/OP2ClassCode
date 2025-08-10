public class FixSlidingWindow {
    public static void main(String[] args) {
        int arr[]={1,9,7,3,8,7,6,0};
        int k=3;
        int maxSum=0;
        int currentSum=0;
        for(int i=0;i<k;i++){
            currentSum+=arr[i];
        }
        maxSum=currentSum;
        for(int i=k;i<arr.length;i++){
            currentSum=currentSum-arr[i-k]+arr[i];
            maxSum= Math.max(currentSum, maxSum);
        }
        System.out.println(maxSum);

    }
}
