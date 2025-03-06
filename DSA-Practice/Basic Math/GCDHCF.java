public class GCDHCF {

    public static void main(String args[]){

        int a=22, b=32;

        while (a>0 && b>0) {
            if (a>b) {
                a=a%b;
            }else{
                b=b%a;
            }
        }

        if (a==0) {
            System.out.println("a==0..."+b);
        }else{
            System.out.println("b==0..."+a);
        }




    }
}