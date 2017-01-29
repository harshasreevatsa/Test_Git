
public class Search {

	public boolean binary_search(int[] arr,int low,int high,int val)
	{
		if(high>=arr.length || low<0)
			return false;
		if(low>=high)
		{
			if(arr[low]==val)
				return true;
//			System.out.println("in here");
			return false;
		}
		int mid = ((low+high)/2);
//		System.out.println("mid = "+mid);
		if(arr[mid]>val)
		{
			return binary_search(arr,low,mid-1,val);
		}
		if(arr[mid]<val)
		{
			return binary_search(arr,mid+1,high,val);
		}
		if(arr[mid]!=val)
			return false;
		return true;
	}


	
	
}
