package fibonacci0;

public class Fibonacci0 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3;
	   
		 System.out.print(num1+" "+num2);  //prints 0 and 1 in the beginning.
		    
		 for(int i = 2; i < 20; i++)    
		 {    
		  num3 = num1 + num2;    
		  System.out.print(" "+num3);    
		  num1 = num2;    
		  num2 = num3;    
	}
	
	}
	
}
