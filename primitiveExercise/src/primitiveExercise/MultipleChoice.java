package primitiveExercise;
import java.util.Scanner;


public class MultipleChoice {
	public static void main(String[] args) {
		
		
		String question = "What is the Scotts Bluff County Seat?";
		String choiceOne = "Mitchell";
		String choiceTwo = "Scottsbluff";
		String choiceThree = "Gering";
		
		System.out.println(question + 
				" " + choiceOne + ", " + 
				" " + choiceTwo + ", " +
				"or " + choiceThree + "?");
		
		String correctAnswer = "Gering";
		//String correctAnswer = choiceThree
		
		Scanner input= new Scanner(System.in);
		//Scanner scanner = new Scanner(System.in);
		//Moved from beginning of code
		
		String answer = input.next();
		
		if (answer.equals(correctAnswer.toUpperCase())) {
			System.out.println("That is correct!");
			//indented again
		} else {
			System.out.println("That is not correct. Please try again.");
			//indented again
		}
	
	}

}