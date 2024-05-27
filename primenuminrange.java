import java.util.*;
public class primenuminrange
 {
     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
     
        for(int i=a;i<=b;i++)
        {
            if(a%i==0)
            count+=1;
        }
        if(count>2)
        {
            System.out.println("Primenumber");
        }
        else{
            System.out.println("notaPrime");
        }
        sc.close();
     }
    
}

