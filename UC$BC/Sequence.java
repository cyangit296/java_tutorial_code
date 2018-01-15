package UC$BC;
public class Sequence {
	private int [] elements;
	private int UCLN (int a, int b)
	{
		if(a==0 || b == 0) 
			return a+b;
		if (a == 0 && b == 0) 
			return 0;
		while (a != b)
		{
			if (a>b)
				a-=b;
			else
				b-=a;
		}
		return a;
	}
	private int BCNN(int a, int b) 
	{
		if (a==0) return b;
		if (b==0) return a;
		int result = (a*b)/UCLN(a,b);
		return result;
	}
	public Sequence() {};
	public Sequence(int [] elements)
	{
		this.elements = elements;
	}
	
	public int getUCLN()
	{
		int ucln = 0;
		for(int i = 0; i < elements.length;i++)
		{
			if(elements[i]!=0)
			{
			ucln = UCLN(ucln,elements[i]);
			}
	    }
		return ucln;
	}
	public int getBCNN()
	{
		int bcnn = 0;
		for(int i = 0; i < elements.length;i++)
		{
			if(elements[i]!=0)
			{
			bcnn = BCNN(bcnn,elements[i]);
			}
	    }
		return bcnn;
	}
}
