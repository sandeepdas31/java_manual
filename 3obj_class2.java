
public class student2 {
	int rollno;
	String name;
	
	void insert_record(int r,String n)
	{
		rollno = r;
		name=n;
	}
	
	void display()
	{
		System.out.println(name+ " "+rollno );
	}
	
	public static void main(String[] args) {
		student2 s1=new student2();
		student2 s2=new student2();
		s1.insert_record(111,"sandeep");
		s2.insert_record(112,"sathya");
		s1.display();
		s2.display();
		
	}

}
