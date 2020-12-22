import java.util.*;
 class sum
   {
     scanners1=new scanner(System.in);
     System.out.println("enter the no");
     int n=s1.nextInt();
     int i=1;
     int sum=0;
     System.out.println("sum of digit"+n"is");
      while(n>0)
       {
         int r=n%10;
         sum=sum+r;
         n=n/10;
       }
     System.out.println("  "+sum);    
   }   
