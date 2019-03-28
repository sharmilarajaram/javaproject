package Array;

public class ArrayLiteral {

	public static void main(String[] args) {
		/*In Basics Of Array class We declared array by initializing its memeory space but in this array literal we can do it dynamically
	by passing all the values for a varaiable in a single step as below*/
		
		int a[]= {1,5,8,9};
		/*Suppose if v want to increase the values in that set v can do it and automatically that newly intialized value
		will be given memory allocation dynamically*/
		System.out.println(a[2]);
		for(int j =0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		

	}

}
