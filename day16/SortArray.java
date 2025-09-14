import java.util.Arrays;
import java.util.PriorityQueue;

public class SortArray {
    public static void main(String[] args) {
        int arr[]={3,6,2,1};
        PriorityQueue<Integer> q= new PriorityQueue<>();
        for(int val:arr){
            q.add(val);
        }
        int idx=0;
        while(!q.isEmpty()){
            arr[idx]=q.poll();
            idx++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
