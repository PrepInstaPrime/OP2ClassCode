import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        HashMap<String , Integer> map= new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        System.out.println(map);
        System.out.println(map.get("a"));
        System.out.println(map.getOrDefault("b",0));
        
    }
}
