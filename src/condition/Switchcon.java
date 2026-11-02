package condition;

import java.util.Scanner;

public class Switchcon {
	Scanner scan=new Scanner(System.in);
    void doit() {
    	System.out.println("what operation you wanna perform?addition:1,subtraction:2,mul:3,division:4");
    	int ch=scan.nextInt();
    	System.out.println("enter number 1 :");
    	int num1=scan.nextInt();
      	System.out.println("enter number 2 :");
    	int num2=scan.nextInt();
    	switch(ch) {
    	case 1:
    		System.out.println(num1+num2);
    		break;
    	case 2:
    		System.out.println(num1-num2);
    		break;
    	case 3:
    		System.out.println(num1*num2);
    		break;
    	case 4:
    		System.out.println(num1/num2);
    		break;
    	default:
    		System.out.println("enter valid option");
    		
    	}
    }
    void sixth() {
    	int num=50;
    	for(int i=1;i<=num;i++) {
    		if(i%6!=0) {
    		continue;
    		}
    		System.out.println(i);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Switchcon obj=new Switchcon();
        obj.sixth();
        obj.doit();
        
	}

}

