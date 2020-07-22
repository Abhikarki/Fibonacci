package fibonacci1;

public class Fibonacci1 {

	public static void main(String[] args) {
        for(int i=0; i<20; i++) {
        	System.out.print(generate(i));
        	System.out.print(" ");     
        }
	}
	
	public static int generate(int num) {
		if (num == 0) {
            return num;
        } 
		else if (num == 1) {
            return 1;
        } 
		else {
            return (generate(num - 1) + generate(num - 2));  //Recursion
        }
		
	}

}
