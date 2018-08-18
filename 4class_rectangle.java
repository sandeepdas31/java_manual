
public class rectangle {
	int length,width;
	
	void insert(int l,int w)
	{
		length = l;
		width=w;
	}
	
	void display()
	{
		System.out.println(length*width );
	}
	
	public static void main(String[] args) {
		rectangle s1=new rectangle();
		rectangle s2=new rectangle();
		s1.insert(11,5);
		s2.insert(112,2);
		s1.display();
		s2.display();
		
	}

}
