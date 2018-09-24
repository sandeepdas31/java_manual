//Java toString() method
class javatostring{  
 int rollno;  
 String name;  
 String city;  
  
 javatostring(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
   
 public String toString(){//overriding the toString() method  
  return rollno+" "+name+" "+city;  
 }  
 public static void main(String args[]){  
	 javatostring s1=new javatostring(101,"Raj","lucknow");  
	 javatostring s2=new javatostring(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
}  
