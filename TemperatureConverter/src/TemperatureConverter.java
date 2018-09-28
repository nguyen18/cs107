import java.util.*;
public class TemperatureConverter {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Hello! Welcome to the temperature converter.");
		
		boolean continueLoop = true;
		
		do {
		System.out.println("Are you converting to celcius or fahrenheit?");
		String setMode = userInput.nextLine();
		
		System.out.println();
		
			while(!setMode.equals("celcius") && !setMode.equals("fahrenheit")) {
				System.out.println("sorry that is not an answer. please try again. (spelling counts!)");
				setMode = userInput.nextLine();
			}
			
			if(setMode.equals("celcius")) {
				
				System.out.println("Please input the temperature in fahrenheit "
						+ "\n(just the number and no degree or \"F/f\" symbol):");
				double fah = (double)(userInput.nextDouble());
				
				double cel = (double)((fah - 32) * (5/9));
				
				System.out.println("\ncelcius = " + cel);
			}
			
			if(setMode.equals("fahrenheit")) {
				
				System.out.println("Please input the temperature in celcius "
						+ "\n(just the number and no degree or \"C/c\" symbol):");
				double cel = (double)(userInput.nextDouble());
				
				double fah = (double)((cel * (5/9)) + 32);
				
				System.out.println("\nfahrenheit = " + fah);
			}
			
			System.out.println("\nDo you have another temperature to convert? yes or no");
			String cont = userInput.nextLine();
			
			if(cont.equals("yes")) {
				continueLoop = true;
			} else if(cont.equals("no")){
				continueLoop = false;
			}
			
		} while (continueLoop == true);
		
	System.out.println("Thank you for converting! Goodbye.");
	}
}
