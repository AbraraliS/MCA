package Interface;

public class CMDargs {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

        // for (int i = 1; i < args.length; i++) {
        //     int y = Integer.parseInt(args[i]);
        //     if (x < y)
        //         x = y;
        // }
        

        int a = 1;
        if (args[a] != null) {
             a++;
             int y = Integer.parseInt(args[a-1]);
             if (x < y)
                x = y;  
            main(args);
          

        }
        System.out.println(x);
    }

}
