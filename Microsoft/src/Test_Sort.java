import java.util.Arrays;

public class Test_Sort {

	
	public static void main(String[] args) {
	Sorting sort = new Sorting();
	Test_Sort test_sort = new Test_Sort();
	String example = "Hello   World How are           you";
	String[] array1s = example.split(" ");
	for(int g = 0;g<array1s.length;g++)
	{
		System.out.println(array1s[g]);
	}

	int[] arr = new int[9];
	int j = 10;
	for(int i=0;i<9;i++)
	{
		arr[i] = j;
		j--;
	}
	System.out.println("original array");
	test_sort.print(arr);
	test_sort.test_Selection_Sort(arr, sort);
	test_sort.test_Bubble_Sort(arr, sort);
	test_sort.test_Insertion_Sort(arr, sort);
	test_sort.test_Merge_Sort(arr, sort);
	test_sort.test_Quick_Sort(arr, sort);
	}
	
	public void test_Selection_Sort(int[] arr,Sorting test)
	{
		System.out.println("testing selection sort");
		print(test.Selection_Sort(arr));
	}
	
	public void test_Bubble_Sort(int[] arr,Sorting test)
	{
		System.out.println("testing bubble sort");
		print(test.bubble_Sort(arr));
	}
	
	public void test_Insertion_Sort(int[] arr,Sorting test)
	{
		System.out.println("testing Insertion sort");
		print(test.insertion_Sort(arr));
	}
	
	public void test_Merge_Sort(int[] arr,Sorting test)
	{
		System.out.println("testing merge sort");
		print(test.merge_Sort(arr));
	}
	
	public void test_Quick_Sort(int[] arr,Sorting test)
	{
		System.out.println("testing quick sort");
		print(test.quickSort(arr));
	}
	
	public void print(int[] arr)
	{
//		System.out.println("");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	
	

}
