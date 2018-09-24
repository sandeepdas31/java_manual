class withoutstring{  
 int rollno;  
 String name;  
 String city;  
  
 withoutstring(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
  
 public static void main(String args[]){  
	 withoutstring s1=new withoutstring(101,"Raj","lucknow");  
	 withoutstring s2=new withoutstring(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
}  
