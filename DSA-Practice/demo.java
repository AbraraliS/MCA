class DemoS{
    int y =10;
    DemoS(int x){
        System.out.println(x);
    }
    void demoM(int a) {
        System.out.println(a);
    }
}

class DemoC extends DemoS{
    DemoC(){
         
           super(10);
    super.demoM(20);
      
        System.out.println(super.y);
    }

  
}



public class demo {
    public static void main(String[] args) {
        DemoC d = new DemoC();
        d.demoM(100); 
    }
}
