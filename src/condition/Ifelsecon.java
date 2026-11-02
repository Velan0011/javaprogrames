package condition;

import java.util.Scanner;

public class Ifelsecon {
    Scanner scan=new Scanner(System.in);
    void doit() {
    	int end=1;
    	while(end==1) {
    	System.out.println("enter the number :");
		int mark=scan.nextInt();
		if(mark>=90 && mark<=100) {
			System.out.println("excellent");
		}
		else if(mark>=80 && mark<90) {
			System.out.println("very good");
		}
		else if(mark>=70 && mark<80) {
			System.out.println("good");
		}
		else if(mark>=60 && mark<70) {
			System.out.println("fine");
		}
		else if(mark>=50 && mark<60) {
			System.out.println("ok");
		}
		else {
			System.out.println("fail");
		}
		System.out.println("wanna end? enter 1 to continue 0 to end");
		end=scan.nextInt();
	
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ifelsecon obj=new Ifelsecon();
		obj.doit();
		
		

	}

}
