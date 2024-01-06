package exam_mutator_accessor;

import java.util.Scanner;

public class DiceGame {
	private int diceFace;
	private int userGuess;
	
	private void rollDice() {
		diceFace = (int)(Math.random()*6) +1;
	}
	private int getUserInput(String prompt) {
		System.out.print(prompt);
		Scanner s = new Scanner(System.in);
		int num =s.nextInt();
		s.close();
		
		return num;
	}
	
	private void checkUserGuess() {
		if(diceFace == userGuess)
			System.out.println("맞았습니다");
		else
			System.out.println("틀렸습니다");
	}
	
	public void startPlaying() {
		userGuess = getUserInput("예상값을 입력해 주세요 :");
		rollDice();
		checkUserGuess();
	}

}
