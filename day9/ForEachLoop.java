import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class ForEachLoop {
public static void main(String[] args) {
    // working with arrays 
    int arr[]= {3,4,2,1,6};
    System.out.println("iterating on arary");
    for(int val:arr){
        System.out.println(val);
    }
    // working with arraylist
    ArrayList<String> list= new ArrayList<>();
    list.add("Ankit");
    list.add("OM");
    list.add("Sohini");
    list.add("Jegan");
    list.add("Krishna");
    System.out.println("Iterating in list");
    for(String str:list){
        System.out.println(str);
    }
    // working with hashset
    HashSet<Character> set= new HashSet<>();
    set.add('S');
    set.add('P');
    set.add('V');
    set.add('A');
    set.add('B');
    System.out.println("Iterating over hashset");
    for(char c:set){
        System.out.println(c);
    }
    // working with hashmap
    HashMap<String, String> map= new HashMap<>();
    map.put("name", "Ankit");
    map.put("age", "20");
    map.put("course", "DSA");
    // iterating over keys 
    System.out.println(map.keySet());  // printing keys
    System.out.println(map.values()); // printing values 
    System.out.println(map.entrySet()); // key values 
    System.out.println("working with map");
    for(String str:map.keySet()){
        System.out.println(str+":"+map.get(str));

    }

}    
}
