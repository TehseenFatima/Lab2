import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicate {
	public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      int n=sc.nextInt();
		      int arr1[]=new int[n];
		      int arr2[]=new int[n];
		      System.out.println("Enter elements of array:");
		      for(int i=0;i<n;i++) {
		         arr1[i]=sc.nextInt();
		      }
		      System.out.println("The array is"+Arrays.toString(arr1));
		      for(int i=0;i<n;i++) 
		      {
		         for (int j=0;j<n;j++) 
		         {
		        	 if(arr1[i]!=arr1[j])
		             {
		        		 arr2[i++]=arr1[i];
		             }
		         }
		      }
		      System.out.println("After removing duplicate elements ::"+Arrays.toString(arr2));
		   }
		}
