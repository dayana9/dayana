

import java.io.*; 

class prNext 
{

            public static void main(String Ar[]) 
           {

               int a=0,i,j; 
               DataInputStream ins=new DataInputStream(System.in); 
              try 
               {

                     System.out.println(“Enter the no.:”); 
                     a=Integer.parseInt(ins.readLine()); 
                } 
                    catch(IOException e) 
                    {} 
                    for(j=a+1;;j++) 
                    {

                         for(i=2;i<j;i++) 
                         { 

                             if(j%i==0) 
                             break; 
                         } 
                      

                      if  (i==j) 
                     {

                        System.out.println(“Next prime no is:”+j); 
                        break; 
                    }

              }

       } 
}