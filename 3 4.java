import java.util.*;
import java.lang.*;
class Alpha
{
    public static void main(String mur[])
    {
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        int i,j;
        int n1=in.nextInt();
        int n2=in.nextInt();
        String str2[]=str1.split(" ");
      
        for(i=0;i<str2.length;i++)
        {
            if((str2[i].length()==n1)||(str2[i].length()==n2))
            {
                char r[]=str2[i].toCharArray();
                for(j=0;j<r.length;j++)
                {
                 if(r[j]!='.')
                {
                   char d=(char)(r[j]+1);  
                   System.out.print(d);
                   }
                   else{
                       System.out.println('.');
                   }
              }
            }
              else{
    System.out.print(" "+str2[i]);
                   }
        }
               
            }
        }
      
      ooooo
      hai madhan kuma
      3 4
      rty madhan vbhy





