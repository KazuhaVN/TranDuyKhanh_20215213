package code65pack;
public class code65class {
	 static void sort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }
	 
	    static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; i++)
	        { System.out.print(arr[i] + " ");}
	 
	        System.out.println();
	    }
	 
	 public static void main(String[] args) {
		 int sum=0;
		 int[] arr= {1789 , 2035 , 1899 , 1456 , 2013 };
		 sort(arr);
		 printArray(arr);
		 for (int i = 0; i < arr.length; i++)
	        {sum=sum+arr[i];}
		 
		double aver=(double)sum/arr.length;
		 System.out.println("Sum is "+sum);
		 System.out.printf("average value is %.2f",aver);
	 
	 }
	
}
