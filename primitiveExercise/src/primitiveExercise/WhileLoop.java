package primitiveExercise;
import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Boolean isOnRepeat = true;
		while (isOnRepeat) {
			System.out.println("Playing current song");
			System.out.println("Would you like to take this song off of repeat? If so, answer yes");
			String userInput = input.next();
			
			if(userInput.equals("yes")) {
				isOnRepeat = false;
				//case sensitive answer
			}
		} 
		System.out.println("Playing next song");
	} 
	
}
