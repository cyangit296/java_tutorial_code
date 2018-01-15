import UC$BC.Sequence;

public class Bai1 {
	public static void main(String [] args)
	{
		int arr [] = {30,10,60,120,12};
		Sequence tmp = new Sequence(arr);
		System.out.println("UCLN = "+tmp.getUCLN());
		System.out.println("BCNN = "+tmp.getBCNN());
	}
	
}
