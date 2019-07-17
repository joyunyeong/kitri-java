/*public class ForTest2 {
	public static void main(String[] args) {
		int dan =5;

		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + i*dan);
		}
		System.out.println();
	}
}
*/


public class ForTest2 {
	public static void main(String[] args) {
		int i,j;
		
		System.out.println("*** 备备窜 1 ***");
		
		for (j=1; j<=9; j++)
			{	
				for (i=2; i<=9 ;i++)
					{	
							System.out.print(i + " * " + j + " = " + i*j + "    ");	
						}
			System.out.println();
					}
			
		System.out.println();
		System.out.println();
		System.out.print("*** 备备窜 2 ***");
		
		for (i=2; i<=9; i++) 
			{	
				for (j=1; j<=9 ;j++) {	
					if (j%9==1)
						{
							System.out.println();	
						}
							System.out.print(i + " * " + j + " = " + i*j + "    ");	
									}
			}
		
		}
	}

