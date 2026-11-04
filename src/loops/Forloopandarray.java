package loops;

import java.util.Scanner;

public class Forloopandarray {
	Scanner scan=new Scanner(System.in);
	void twodarray() {
		System.out.println("enter the no of row :");
		int row=scan.nextInt();
		System.out.println("enter the no of col :");
		int col=scan.nextInt();
		int[][] twod =new int[row][col];
		System.out.println("enter the elements :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				twod[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
			System.out.print(twod[i][j]);
			}
			System.out.println();
		}
	}
	void normarray() {
		  int[] array= {2,3,4,5,6,7};
	       for(int ele:array) {
	    	   System.out.println(ele);
	       }
	}
	void doitarray() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array :");
		int size=scan.nextInt();
         int[] array=new int[size];
         for(int i=1;i<=size;i++)
         {
         System.out.println("enter the element "+i);
         array[i-1]=scan.nextInt();
         }
         for(int ele:array)
         {
         System.out.println(ele);
         }        
	}
	void doitString() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array :");
		int size=scan.nextInt();
         String[] array=new String[size];
         for(int i=1;i<=size;i++)
         {
         System.out.println("enter the element "+i);
         array[i-1]=scan.next();
         }
         for(String ele:array)
         {
         System.out.println(ele);
         }
         
         
         
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Forloopandarray obj=new  Forloopandarray();
		 obj.twodarray();
		 obj.normarray();
		 obj.doitarray();
		 obj.doitString();
	}

}
