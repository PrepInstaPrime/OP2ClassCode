public class BruteForce {
    public static void main(String[] args) {
        int arr[]={1,9,7,3,8,7,6,0};
        int k=3;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int currentSum=0;
            for(int j=i;j<k+i;j++){
                currentSum+=arr[j];
            }
            maxSum= Math.max(maxSum, currentSum);

        }
    }
}
