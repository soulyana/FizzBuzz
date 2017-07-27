package fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		String str = ""; 
		
		for(int i = 1; i < 100; i++) {
			if(i % 2 == 0) {
				str += "Copy";				
			} else if (i % 3 == 0) {
				str += "Fizz"; 
			} else if(i % 10 == 0) {
				str += "Cat"; 
				
			} else if (i % 5 == 0) {
				str += "Buzz"; 
			}
		}
	System.out.println(str);
	
	}

}
