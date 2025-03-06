import java.util.Scanner;

class Armstrong{

        public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int n = scanner.nextInt();
        int og = n;
        //A number 371 is armstrong or not

        int sum = 0; 
      
            while (n>0) {
                int d = n % 10;
                
                sum = sum + (d * d * d);
                n/=10;  
            }
            if (sum == og) {
                System.out.println("The Number is Armstrong");
            }
            else{
                System.out.println("The Number is not Armstrong");
            }
            scanner.close();
        }
        
    }
