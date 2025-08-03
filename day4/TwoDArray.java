import java.util.Scanner;
import java.util.Arrays;
public class TwoDArray {
    static int sumOfArray(int nums[][]){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                sum+=nums[i][j];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r= sc.nextInt();
        System.out.println("Enter the number of columns");
        int c= sc.nextInt();
        int arr[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter the value arr["+i+"]["+j+"] ");
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.print('[');
        for(int i=0;i<r;i++){
            System.out.print(Arrays.toString(arr[i])+",");
        }
        System.out.println(']');
        System.out.println(sumOfArray(arr));
    }
}