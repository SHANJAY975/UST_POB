package lamda;

interface Printable{
    void print();
    default void scan(){
        System.out.println("Scanning the data");
    }
}
interface StringUpdater{
    String UpdateString(String str);
}

public class LamdaExpression {
    static void main(String []args){
//        Printable obj = ()-> System.out.println("Shanjay Testing the website");
//        obj.print();
//        obj.scan();

        StringUpdater toupper = (str) -> str.toUpperCase();
        System.out.println(toupper.UpdateString("shajay"));
        StringUpdater tolower = (str) -> str.toLowerCase();
        System.out.println(tolower.UpdateString("SGANNSF"));
    }
}
