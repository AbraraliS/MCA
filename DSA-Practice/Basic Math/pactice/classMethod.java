package pactice;

public class classMethod {
    String carColor;

    public classMethod(String color){
        carColor = color;
        
    }
    public void startEng(){
        
        System.out.println("Its start ...");
        System.out.println("And Stopped....");
    }
    public static void main(String[] args) {
        classMethod cm = new classMethod("blue");
        cm.startEng();
        System.out.println(cm.carColor);
    }
}
