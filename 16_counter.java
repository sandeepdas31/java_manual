//Program of counter without static variable
	class counter{  
	int count=0;//will get memory when instance is created  
	  
	counter(){  
	count++;  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	  
	counter c1=new counter();  
	counter c2=new counter();  
	counter c3=new counter();  
	  
	 }  
	}  
