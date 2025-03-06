

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("abc");
        list.add("abcd");
        list.add("abce");
        list.add("abcf");
        list.add("abcg");

        System.out.println("size"+ list.size());

        System.out.println("get"+ list.get(4));

        list.set(3, "Hello");
        list.remove("abc");
        int ind = list.indexOf("abcd");

        System.out.println("Index"+ list + "=="+ind);
    }
}
