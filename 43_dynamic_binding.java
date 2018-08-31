//dynamic binding
	class Animal01{  
	 void eat(){System.out.println("animal is eating...");}  
	}  
	  
	class Dog2 extends Animal01{  
	 void eat(){System.out.println("dog is eating...");}  
	  
	 public static void main(String args[]){  
	  Animal01 a=new Dog2();  
	  
	  a.eat();  
	 }  
	}  




