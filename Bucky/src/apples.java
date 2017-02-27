public class apples {
	public static void main(String args[]) {
		
	// A = P (1 + R) ^n;
		
		double amount, rate = 0.1, principal = 10000; // Using double because we want decimal points
		
		for (int day = 1; day <= 20; day++) {
			
			amount = principal * Math.pow(1 + rate, day); // A simple Math.pow example: Math.pow(2, 8) = display 2 to the power of 8. 
			System.out.println(day + "   " + amount);
			
		}
		
	}
		
}
	

