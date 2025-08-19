package Interface;

import java.util.Scanner;


public class Class1 {
    Scanner sc = new Scanner(System.in);
    static Interface1 interfce = new InterfaceClass();

    public static void main(String[] args) {
        interfce.SRN("R24DE175");
        interfce.myName("AZS");
        interfce.myResult(new float[]{23,43,23});
    }
}
