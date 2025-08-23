import java.util.HashSet;
public class SetEx {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        // adding values 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        System.out.println(set);
        // removing the value 
        System.out.println(set.remove(3));
        System.out.println(set);
        // checking set is empty of not
        System.out.println(set.isEmpty());
        // size 
        System.out.println(set.size());
        // looking for a value 
        System.out.println(set.contains(2));
        System.out.println(set.contains(3));
        // removing everything 
        set.clear();
        System.out.println(set);

    }
}
