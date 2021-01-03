package com.xworkz.aptitude.pattern;



public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=7;
		int a=number/2+1;
		int b=1;
		int i,j;
		for (i = 1; i <=number; i++) {
			{
				for(j=1;j<=number;j++) {
					if(j==a||j==number-a+1)
					{
						System.out.print(b);
					}else {
						System.out.print(" ");
					}
				}
				if(i<=number/2)
				{
					a--;
					b++;
				}else {
					a++;
					b--;
				}
				System.out.println();
			}
		}
		System.out.println();

	}

}
