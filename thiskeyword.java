import java.io.*;
 public class ThisDemo{
     private int a;
     public void SetNumber(int a){
         this.a=a;
         System.out.println("value of a is "+a);
     }
     public static void main(String args[]){
         ThisDemo td=new ThisDemo();
         td.SetNumber(50);
     }
 }
   
