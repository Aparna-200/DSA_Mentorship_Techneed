// count the number of digits in the given number
import java.util.*;
class first {
    public static void main(String[] args) {
        try (Scanner num = new Scanner(System.in)) {
            System.out.print("Enter any number : ");
            int n = num.nextInt();
            int i = n;
            int d = 0 ;
            while(i>0){
                n = i%10;
                d = d+1;
                i = i/10;
            }
            System.out.println("Number of digits in the given number is : "+d);
            }
        }
}


