//Here is a fun program..
//   It takes 2 names as input and displays the relation between those names 
//   based on a fixed method...
//   You can try your name with crush's name.......

import java.util.*;
class FLAME
{
      public static void main()
      {
           int p=1;
           do
           {
                 int i,j,n=0,r=0;
                 char t;
                 String s;
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enterme");
                 String s1=sc.nextLine();
                 System.out.println("Enternd name"); 
                 String s2=sc.nextLine(); 
                 if (s1.compareTo(s2)>0)
                 {
                       s=s1;
                       s1=s2;
                       s2=s;
                 }
                 char c1[]=new char[s1.length()];
                 char c2[]=new char[s2.length()];
                 for (i=0;i<c1.length;i++) 
                  c1[i]=s1.charAt(i);
                 for (i=0;i<c2.length;i++)
                  c2[i]=s2.charAt(i);
                 for (i=0;i<c1.length;i++)
                  { 
                       for (j=n;j<c2.length;j++)
                        {
                              if (c1[i]==c2[j])
                               {
                                    t=c2[j];
                                    c2[j]=c2[n];
                                    c2[n]=t;
                                    n++;
                                    break;
                               }
                       } 
                  }
                  int x=c1.length+c2.length-n*2;
                  String F[]={"","F","L","A","M","E",""};
                  int k=5;
                  r=x;
                  int x1=x,l=0;
                  if (r>0)
                  {
                        while (k>1)
                        {
                               while (x1>k)
                                   x1=x1-k;
                               r=x1;
                               if (r==0)
                                    r=1;
                               for (i=r;i<=k;i++) 
                                 F[i]=F[i+1];
                               if ((x+r)>k)
                                 x1=x+r-k;
                               else
                                 x1=r+x-1;
                               k--;
                         }
                         String q=F[1];
                         switch(q)
                         {
                                 case "F":System.out.println("Friends");break;
                                 case "L":System.out.println("Love");break;
                                case "A":System.out.println("Affectionate");break;
                                case "M":System.out.println("Marraige");break;
                                case "E":System.out.println("Enemy");break;
                                default:System.out.println("Error");
                         }
                 }
                 else
                   System.out.println("Error :");
                   System.out.println("Dont to continue(1-y/2-n)");
                   p=sc.nextInt();
          }
          while (p==1);
     }
}
