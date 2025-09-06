public class LinearSearch {
    public static int findIndex(int arr[],int target){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    return i;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        int arr[]= {6,3,4,7,9,1,5};
        int target=19;
        System.out.println(findIndex(arr, target));
    }
}
