abstract class Parent{
    // abstract method
    abstract void intro();
    // concrete method
    public void money(){
        System.out.println("1Cr");
    }
    // static void check(){
    //     System.out.prinln("hey");
    // }
    // constructor 
    // constructors are the methods who does not return any thing and they will have the same name as class name , also they will be executed the time of object creation
    public Parent(){
        System.out.println("you have successfully created object");
    }
}
class Child extends Parent{
    public void intro(){
        System.out.println("Hey i am child of parent");
    }
}
// multi level inheritance 
class GrandChild extends Child{
    public void introduction(){
        System.out.println("i am the grand child");
    }
}
public class AbstractEx {
    public static void main (String args[]){
        Child obj= new Child();
        obj.intro();
        obj.money();
        GrandChild obj1= new GrandChild();
        obj1.introduction();
    }
}