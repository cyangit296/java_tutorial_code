package Sort;
/*
 * Lay chuoi : get
 * Nhap chuoi : set
 * Sap xep tang dan : arrAscending
 * Sap xep giam dan : arrDiscending
 * */
 public class Array {
	private int[] elements;
	
	public Array() {};
	
	public int[] get()
	{
		return elements;
	}
	
	public Array(int[] elements)
	{
		this.elements = elements;
	}
	/* Support */
    private void Swap(int elements[],int a,int b)
	{
		int tmp = elements[a];
		elements[a] = elements[b];
		elements[b] = tmp;
	} 
    private void arrReverse()
    {
    	for (int i=0;i<elements.length/2;i++)
    		Swap(elements,i,elements.length-i-1);
    }
    public int[] arrAscending()
    {
    	return elements;
    }
    public int[] arrDiscending()
    {
    	arrReverse();
    	return elements;
    }
	/* function sort */
	/* Bubble Sort 
	 * So sanh 2 phan tu lien ke. Dua so nho nhat ve dau day*/
	public void BubbleSort()
	{
		int tmp;
		for (int i = 1;i<elements.length;i++)
			for (int j=elements.length-1;j>=i;j--)
				{
					if (elements[j-1] > elements[j])
					{
						tmp = elements[j-1];
						elements[j-1]=elements[j];
						elements[j]=tmp;
					}
				}
	}
	/* QuickSort */
	public void QuickSort(int left,int right)
	{
		int i = left,j = right,tmp;
		int pivot = (left+right)/2 ;
		while (i < j)
		{
			while (elements[i]<elements[pivot]) i++;
			while (elements[j]>elements[pivot]) j--;
			if(i <= j)
			{
						
				tmp = elements[i];
				elements[i]=elements[j];
				elements[j]=tmp;
				i++;
				j--;
			}
		}
		if(i < right) QuickSort (i,right);
		if(j > left) QuickSort(left,j);
	}
	/* Insert Sort 
	 * Lay gia tri dau tien lam goc.
	 * Duyet tu phan tu thu 2 tro di.
	 * Luu gia tri tai vi tri i.
	 * Duyen xem no da dung dung thu tu so voi gia tri lien truoc no hay chua?
	 * Neu NOT thi dich cac gia tri sau den khi no dung dungs thu tu.
	 * */
	public void InsertSort()
	{
		int j ,tmp;
		for (int i = 1;i < elements.length;i++)
		{
			tmp = elements[i];
			j = i;
			while (j>0 && elements[j-1]>tmp)
			{
				elements[j] = elements[j-1];
				j--;
			}
			elements[j] = tmp;
		}
		
	}
	/* Selection Sort
	 * Duyet day tu dau den cuoi.
	 * Lay gia trj dau tien lam gia tri min va luu chi so cua no.
	 * Tim gia trj nho nhat trong chuoi con con lai va luu lai vi tri.
	 * Dua gia trj nho nhat tim duoc len dau day bang cach doi vi tri voi gia tri dau tien.
	 * Tiep tuc duyen cho toi phan tu (length-1)
	 * */
	public void SelectionSort()
	{
		for (int i=0;i<elements.length-1;i++)
		{
			int index = i;
			for (int j = i+1;j<elements.length;j++)
				if (elements[j]<elements[index]) index = j;
			{
				int tmp = elements[i];
				elements[i] = elements[index];
				elements[index] = tmp;
			}
		}
	}
	/* Interchange Sort*/
	public void InterchangeSort()
	{
		for (int i = 0;i < elements.length - 1;i++)
			for (int j = i+1; j < elements.length;j++)
				if(elements[j]<elements[i])
				Swap(elements,i,j);
				
	}
	/*
	public void MegreSort() 
	{
		
	}
	public void HeapSort()
	{
		
	}
	*/
}