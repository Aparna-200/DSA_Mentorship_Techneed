
import java.util.*;
class first {
    public static void main(String[] args) {
        try (Scanner num = new Scanner(System.in)) {
            System.out.print("Enter any number : ");
            int n = num.nextInt();
            int i;
            int flag = 0;
            for(i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flag = 1;
                    break ;
                }
            }
            if(flag==1)
            {
                System.out.println(n+" is not Prime number");
            }
            else
            {
                System.out.println(n+" is Prime number");
            }
        }
}
}
