// Reverse of the given number
import java.util.*;
class first {
    public static void main(String[] args) {
        try (Scanner num = new Scanner(System.in)) {
            System.out.print("Enter any number : ");
            int n = num.nextInt();
            int i = n;
            int  rem;
            int rev = 0 ;
            while(i>0){
                rem = i%10;
                rev = rev * 10 + rem;
                i = i/10;
            }
            System.out.println("Reverse of number is : "+ rev);
            }
        }
}

