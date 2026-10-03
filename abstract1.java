abstract class A{
    abstract void fly();
    abstract void eat();
    void B(){
        System.out.println("I am a concrete method");
    }
}
abstract class B extends A{
     void eat(){
        System.out.println("I am eating");
    }
}
class C extends B{
    void fly(){
        System.out.println("I am flying");
    }
}
public class abstract1 {
    public static void main(String[] args) {
    A obj=new C();
    obj.fly();
    obj.eat();
    }
}
