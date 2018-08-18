
public class mulobj {
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
		mulobj s1=new mulobj(),s2=new mulobj();
		s1.insert(11,5);
		s2.insert(3,15);
		s1.display();
		s2.display();
		
	}

}
