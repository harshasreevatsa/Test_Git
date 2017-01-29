
public class Test_Search {

	public static void main(String[] args) {

		Search search = new Search();
		Test_Search test = new Test_Search();
		test.Binary_Search_Test(search);
	}
	public void Binary_Search_Test(Search search)
	{
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
//		arr[4] = 5;
		System.out.println(search.binary_search(arr, 0, 3, 7));
	}

}
