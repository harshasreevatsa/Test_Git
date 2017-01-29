import java.util.Arrays;

public class Sorting {

	public int[] Selection_Sort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int index = find_Min(arr,i,arr.length);
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		return arr;
	}
	
	public int find_Min(int[] arr,int start_index,int end_index)
	{		
		int min = Integer.MAX_VALUE;
		int index = start_index;
		for(int i=start_index;i<end_index;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	public int[] bubble_Sort(int[] arr)
	{
		for(int j=0;j<arr.length;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		return arr;
	}
	public int[] insertion_Sort(int[] arr)
	{
		for(int j=0;j<arr.length;j++)
		{			
			for(int i=j;i>0;i--)
			{
				if(arr[i]<arr[i-1])
				{
					 int temp = arr[i];
					 arr[i] = arr[i-1];
					 arr[i-1] = temp;
				}
			}
		}
		return arr;
	}
	
	public int[] merge_Sort(int[] arr)
	{
		if(arr.length==1)
			return arr;
		if(arr.length==2)
		{
			if(arr[0]<arr[1])
				return arr;
			else
			{
				int temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
			}
			return arr;
		}
		int[] arr1 = Arrays.copyOfRange(arr, 0, arr.length/2);
		int[] arr2 = Arrays.copyOfRange(arr, arr.length/2,arr.length);
		
		arr1 = merge_Sort(arr1);
		arr2 = merge_Sort(arr2);
		
		return merge(arr1,arr2);
		
	}
	
	public int[] merge(int[] arr1,int[] arr2)
	{
		int i = 0;
		int j = 0;
		int[] arr = new int[arr1.length+arr2.length];
		int index = 0;
		while(i<=arr1.length-1 && j<=arr2.length-1)
		{
			if(arr1[i]>arr2[j])
			{
				arr[index] = arr2[j];
				j++;
				index++;
			}
			else
			{
				arr[index] = arr1[i];
				i++;
				index++;
			}
		}
		while(i<=arr1.length-1)
		{
			arr[index] = arr1[i];
//			System.out.println("in here = "+arr[index]+", i = "+i+", arr1.length = "+arr1.length);
			i++;
			index++;
		}
		while(j<=arr2.length-1)
		{			
			arr[index] = arr2[j];
//			System.out.println("in here = "+arr[index]);
			j++;
			index++;
		}
		return arr;
	}
	

	public int[] quickSort(int[] arr)
	{
		if(arr.length==1)
			return arr;
		if(arr.length==2)
		{
			if(arr[0]>arr[1])
			{
				int temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
				return arr;
			}
			return arr;
		}
		int pivot = arr[0];
		int temp = arr[arr.length-1];
		arr[arr.length-1] = arr[0];
		arr[0] = temp;
		
		int i = 0;
		int j = arr.length-2;
		while(i<j)
		{
			if(arr[i]>pivot && arr[j]<pivot)
			{
				swap(arr,i,j);
				i++;
				j--;
			}
			else
			{
				if(arr[i]<=pivot)
					i++;
				if(arr[j]>=pivot)
					j--;
			}
		}
		swap(arr,i,arr.length-1);
		return arr;
	}
	
	public void swap(int[] arr,int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	
	
}
