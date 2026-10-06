enum s{
    a,b,c;
}
interface k{
    void run();
    void fly();
}
interface l extends k{
    void drive();
}
class m implements l{
    public void run(){
        System.out.println("run method called");
    }
    public void fly(){
        System.out.println("fly method called");
    }
    public void drive(){
        System.out.println("drive method called");
    }
}
public class interf {
    public static void main(String[] args) {
        m obj=new m();
        obj.run();
        obj.fly();
        obj.drive();
        k obj1=new m();
        obj1.run();
        obj1.fly();
        s obj2=s.a;
        System.out.println(obj2);
    }
}