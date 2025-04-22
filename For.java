package pack;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a=new int[10][10];
		
Scanner sc=new Scanner(System.in);
		for (int i=0;i<2;i++)
			for (int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
				
for (int i=0;i<2;i++)
		for (int j=0;j<2;j++)
		{
			System.out.println(a[i][j]);
		}

}
}
