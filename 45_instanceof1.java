//Another example of java instanceof operator
	class Animal04{}  
	class Dog04 extends Animal04{//Dog inherits Animal  
	  
	 public static void main(String args[]){  
	 Dog04 d=new Dog04();  
	 System.out.println(d instanceof Animal04);//true  
	 }  
	}  
