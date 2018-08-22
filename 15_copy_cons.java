//Java Copy Constructor
	class copycns{  
	    int id;  
	    String name;  
	    copycns(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	      
	    copycns(copycns s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	copycns s1 = new copycns(111,"Karan");  
	    	copycns s2 = new copycns(s1);  
	    s1.display();  
	    s2.display();  
	   }  
	}  
