package Array;

public class BasicsOfArray {

	public static void main(String[] args) {
		
		int a= 5;
		//The above one is just declaring value for the variable suppose if v want to decare more than one value to the same variable then v ll go for array
		
		//Array is to store multiple values for a same variable and of same data type
		
		int b[]=new int[5];
		//We have declared that b is of int type which stores 5 variable(size)
		b[0]=1;
		b[1]=2;
		b[3]=7;
		b[4]=9;
		//We have assigned values for all the variable starting with the index
		System.out.println(b.length);
		System.out.println(b[1]);
				

	}

}
