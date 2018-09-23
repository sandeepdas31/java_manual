class A11{  
private int data=40;  
private void msg(){System.out.println("Hello java");}  
}  
  
public class simple1{  
 public static void main(String args[]){  
   A11 obj=new A11();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
   }  
}  
