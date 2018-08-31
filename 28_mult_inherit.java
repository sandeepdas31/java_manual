//Why multiple inheritance is not supported in java?
	class n{  
	void msg(){System.out.println("Hello");}  
	}  
	class m{  
	void msg(){System.out.println("Welcome");}  
	}  
	class C extends n {//suppose if it were  
	   
	 public static void main(String args[]){  
	   C obj=new C();  
 obj.msg();//Now which msg() method would be invoked?  
	}  
	}  
