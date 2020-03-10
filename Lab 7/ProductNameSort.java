package lab7;

public class ProductNameSort {

	public static void main(String[] args) 
	{
		String [] arr =new String[5];
		arr[0]="soap";
		arr[1]="shampoo";
		arr[2]="bottle";
		arr[3]="book";
		arr[4]="pen";
		System.out.println("Before sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		String temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j+1])>0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		System.out.println("     ");
		System.out.println("After Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");

		}
		


	}

}
