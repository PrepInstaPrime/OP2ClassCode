import java.util.ArrayList;
import java.util.Arrays;
public class ListEx {
    public static void main(String[] args) {
        // creation of list
        ArrayList<Integer> list = new ArrayList<>();
        // adding values 
        list.add(1);
        list.add(2);
        list.add(3);
        // size of the list
        System.out.println(list.size());
        // getting values or iterating
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        // printing directly 
        System.out.println(list);
        // update the list
        list.set(2, 5);
        System.out.println(list);
        // remove the value from list
        System.out.println(list.remove(2));
        System.out.println(list);
        // remove everything 
        // list.clear();
        // System.out.println(list);
        // converting arraylist to array
        System.out.println(Arrays.toString(list.toArray()));

    }
}
