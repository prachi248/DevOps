import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args)
	{
		int arr[]= {10,22,33,25,49};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number between 1 to 50: ");
		int n=sc.nextInt();
		if(n<1 && n>50)
			System.out.println("wrong input");
		else
			{
			int f=1;
			for(int x:arr)
				{
					if(x==n);
					{
						System.out.println("Bingo");
						f=0;
					}
				}
			if(f==1)
				System.out.println("sorry");
			}
		
	}

}

