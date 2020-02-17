import java.util.Scanner;


public class SGTIntro {

	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Hi! Do you want to play Java Trivia? (Answer Y/N)");
		String answerYN = input.nextLine();
		
		if(answerYN.equalsIgnoreCase("Y")){
			System.out.println("Great! Let's play!");
			
		}else if(answerYN.equalsIgnoreCase("N")){
			System.out.println("Have a nice day!");
			
		}else{
			System.out.println("Please, answe with Y or N.");
		}
		

	}

}
