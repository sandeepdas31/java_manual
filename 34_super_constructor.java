//super is used to invoke parent class constructor.
	class Vehicle3{  
	  Vehicle3(){System.out.println("Vehicle is created");}  
	}  
	  
	class Bike5 extends Vehicle3{  
	  Bike5(){  
	   super();//will invoke parent class constructor  
	   System.out.println("Bike is created");  
  }  
	  public static void main(String args[]){  
	   Bike5 b=new Bike5();  
	        
	}  
	}  
