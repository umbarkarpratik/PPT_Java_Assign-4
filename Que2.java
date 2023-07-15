package PrePlacementTraning.JavapptaAssign_4;
//Q2.Write a program a Program with 2 concrete method and 2 abstract method in java ?
abstract class Parent{
    abstract void call();
    abstract void receive();

    void sleep(){
        System.out.println("Sleep");
    }
    void eat(){
        System.out.println("eat the food");
    }
}
class child1 extends Parent{
    void call(){
        System.out.println("call to interface method");
    }
    void receive(){
        System.out.println("interace method implementation");

    }

}
public class Que2 {

    public static void main(String[] args) {
       
       child1 c=new child1();
       c.call();
       c.receive();
       c.eat();
       c.sleep();
        
        
    }
}
