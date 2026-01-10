import java.lang.String;

class A{
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    public B(String s){
        System.out.println("B");
    }

    public static void main(String[] args) {
        new A();
        System.out.println(" ");
    }
}
