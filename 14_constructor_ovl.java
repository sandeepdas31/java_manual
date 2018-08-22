//Constructor Overloading in Java
	class consovl{  
	    int id;  
	    String name;  
	    int age;  
	    consovl(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    consovl(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	    public static void main(String args[]){  
	    	consovl s1= new consovl(111,"Karan");  
	    	consovl s2= new consovl(222,"Aryan",25);  
	    s1.display();  
        s2.display();  
    }  
	}  
