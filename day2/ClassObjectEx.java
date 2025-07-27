class House{
    String rest="Bed";
    String water="10L";
    String food="Rice";
}
public class ClassObjectEx {
    static String name="Operation Placement";
    // static keyword allow us to access the properties of the same class without creating the object of it 
    public static void main(String args[]){
        House krishna= new House();
        System.out.println(krishna.rest);
        System.out.println(krishna.water);
        System.out.println(name);
    }
}