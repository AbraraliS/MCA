

class InnerP06 {

    public static void abc() {
        System.out.println("Hello, World!");
    }
} 


    




public class P06 {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        InnerP06 ip = new InnerP06();
        ip.abc();
    }   
}