//Is final method inherited?
	class Bike03{  
	  final void run(){System.out.println("running...");}  
	}  
	class Honda2 extends Bike03{  
	   public static void main(String args[]){  
	    new Honda2().run();  
	   }  
	}  
