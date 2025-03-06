// package Hash;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPrac {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
       

        while (true) {
            
            System.out.println("Select 1 to Insertion Elements.");
            System.out.println("Select 2 to Delete Elements.");
            System.out.println("Select 3 to Update Elements.");
            System.out.println("Select 4 to Display Elements.");
            System.out.println("Select 5 for End.");

            System.out.print("Select Option : ");
            int select = sc.nextInt();
           //2 sc.nextLine();
            switch (select) {
                case 1:
                System.out.print("Enter how Many Elements you want to insert : ");
                int n = sc.nextInt();
                sc.nextLine();
                    String s;
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter index " + i + " String : ");
                        s = sc.nextLine();
                        list.add(s);
                    }
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("There is nothing to delete.");
                    } else {
                        System.out.println("Select Element from 0 to " + (list.size() - 1));
                        int delElem = sc.nextInt();
                        sc.nextLine();
                        if (delElem >= 0 && delElem < list.size()) {
                            list.remove(delElem);
                            System.out.println("Element " + delElem + " deleeted Successfully...");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("There is nothing to delete.");
                    } else {
                        System.out.print("Select Element from 0 to " + (list.size() - 1) + " Which you want to update : ");
                        int updElem = sc.nextInt();
                        sc.nextLine();
                       
                       
                        if (updElem >= 0 && updElem < list.size()) {
                            System.out.print("Enter Element Which you want to update : ");
                            String uElem = sc.nextLine();
                            list.set(updElem, uElem);
                            System.out.println("Element " + updElem + "Updated Successfully...");
                        } 
                        else {
                            System.out.println("Invalid index.");
                        }
                    }   

                    break;
                case 4:
                    if (list.isEmpty()) {
                        System.out.println("List is Empty please insert Element first.");
                    } else {
                        for(int i = 0; i<list.size(); i++){
                            System.out.println("Index No "+i+". is "+list.get(i));
                        }
                       
                    }
                    break;

                case 5:
                    System.out.println("Programm is about to close....");
                    sc.close();
                    return;
                // break;

                default:
                    break;
            }
        }

    }
}
