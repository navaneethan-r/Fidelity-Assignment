class A{
    public void play(){
        System.out.println("Playing....");
    }
}
class B extends A{
    public void sing(){
        System.out.println("Singing....");
    }
}
class C extends B{
    public void dance(){
        System.out.println("Dancing....");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.play();
        obj1.sing();
        obj1.dance();
    }
}
