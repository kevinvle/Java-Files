import java.util.Random;


public class apples {
	public static void main(String[] args) {
		Random rand = new Random();
		int freq[] = new int [7]; // made an array named freq with 7 elements
		
		for (int roll = 1; roll<1000; roll++) {
			++freq[1 + rand.nextInt(6)]; // made a random number gen to roll numbers 0 - 5. Added one to it so it'll roll 1-6. 
			//Every time it rolled one of those numbers, it added one to that index at freq.
			
		}
		
		System.out.println("Face \t Frequency");
		
		for(int face = 1; face < freq.length; face++) {
			System.out.println(face + "\t" + freq[face]); // face = dice number, freq[face] = value of number
		}
	
		
	}
			
		
	}
