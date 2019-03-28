package Array;

public class MultiDimensionArray {

	public static void main(String[] args) {
		//Declaring values in x,y formati in a array
	
		/*declaring multi values for an array in x,y format as a(row)(column) is called multidimension
		 declaring values by initializing memory allocation
		 */
		int a[][]=new int[2][3];
		a[0][0]=2;
		a[0][1]=1;
		a[0][2]=4;
		a[1][0]=7;
		a[1][1]=8;
		a[1][2]=4;
		//a[1][3]=5;
		
		//System.out.println(a[1][2]);
		
		/*Declaring values in normal way with dynamic memory allocation for Multi dimension
		 * we will declare in(x,y) format with a set,we have to declare everything in flower braces only
		 */
		
		int b[][]= {{2,4,5},{1,2,3}};
		for(int i =0;i<2;i++) {
			for(int j=0;j<3;j++)
			{
				System.out.println(b[i][j]);
			}
		}	
		
	}

}
