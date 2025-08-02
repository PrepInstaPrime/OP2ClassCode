interface Mather{
    // abstract method
    void intro();
    // concrete methods was not possible before java 8 after java 8 we can use default keyword to define concrete methods
    default public void money(){
        System.out.println("5Lakhs");
    }

}

interface Father{
    void decipline();
}
// multiple inheritance 
class Child1 implements Mather, Father{
        public void intro(){
            System.out.println("Hey this is coming from Mother class");
        }
        public void decipline(){
            System.out.println("Hey this is coming from my father");
         }
}
public class Interfacesex {
    public static void main(String args[]){
        Child1 obj = new Child1();
        obj.decipline();
        obj.intro();
        obj.money();
    }
}