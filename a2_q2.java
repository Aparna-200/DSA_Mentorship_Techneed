
import java.util.*;
class first {
    public static void main(String[] args) {
        try (Scanner num = new Scanner(System.in)) {
            System.out.print("Enter the marks of student : ");
            int n = num.nextInt();
            if( n > 90)
            {
                System.out.println(" Excellent ");
            }
             else if(( n <= 90 )&&(n>80))
            {
                System.out.println(" Good ");
            }
            else if((n <= 80)&&(n >70 ))
            {
                System.out.println(" Fair ");
            }
            else if( (n<=70)&&(n > 60))
            {
                System.out.println(" Meet Expectations ");
            }
            else if(n<=60)
            {
                System.out.println(" Below par ");
            }
        
        }
}
}
