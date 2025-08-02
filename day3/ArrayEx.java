import java.util.Arrays;
public class ArrayEx {
    public static void main(String args[]){
        String str[]= new String[5];
        int nums[]= new int[5];
        int arr[]={1,3,5,7};
        System.out.println((Arrays.toString(str)));
        System.out.println(Arrays.toString(nums));
        System.out.println(arr);

        //accessing the individual values 
        System.out.println(arr[1]);
        // updating the value 
        arr[2]=50;
        System.out.println(Arrays.toString(arr));

        // iterating over array 
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        // 2D arrays 
        int arr1[][]= new int[3][2];
        for(int i=0;i<arr1.length;i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
        int nums1[][]={{1,2},{3,4},{5,6}};
        for(int i=0;i<nums1.length;i++){
            System.out.println(Arrays.toString(nums1[i]));
        }
        // 3D Array
        int arr2[][][]= new int[3][2][3];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.println(Arrays.toString(arr2[i][j]));
            }
           
        }
    }
}