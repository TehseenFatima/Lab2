
public class SecondSmallest {

	static void Secondlargest(int arr[], int arr_size)
	{

	    int i, first, second;
	    if (arr_size < 2)

	    {
            System.out.printf(" Invalid Input ");
            return;

	    }
	    int largest = second = Integer.MIN_VALUE;
	    for(i = 0; i < arr_size; i++)

	    {
             largest = Math.max(largest, arr[i]);
        }
	    for(i = 0; i < arr_size; i++)

	    {
             if (arr[i] != largest)

	            second = Math.max(second, arr[i]);
        }
        if (second == Integer.MIN_VALUE)

	        System.out.printf("There is no second " +"largest element\n");
        else

	        System.out.printf("The second largest " + "element is %d\n", second);
	}
	 
	public static void main(String[] args)
	{

	    int arr[] = { 5, 10, 15, 20, 25, 30 };

	    int n = arr.length;

	    Secondlargest(arr, n);
	}

		


}
