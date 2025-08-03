import java.util.*;
class ReverseArray {
    static void reverseArray(int nums[]){
        int left=0;
        int right= nums.length-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the value of arr["+i+"] ");
            arr[i]= sc.nextInt();
        }
        System.out.println("Orginal array "+Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reverse array "+Arrays.toString(arr));
    }
}