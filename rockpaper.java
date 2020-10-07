import java.util.Scanner;

public class rockpaper {
	public static void main(String[] args) {
		System.out.println("ROCK - PAPER - SCISSOR");
		// ROCK - 0, PAPER - 1, SCISSOR - 2

		initPlay();
	}
  
	public static void initPlay() {
		String[][] game = new String[3][3];
		game[0][0] = "T";
		game[0][1] = "C";
		game[0][2] = "P";
		game[1][0] = "P";
		game[1][1] = "T";
		game[1][2] = "C";
		game[2][0] = "C";
		game[2][1] = "P";
		game[2][2] = "T";
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your choice: (ROCK - 0),  (PAPER - 1),  (SCISSOR - 2), (EXIT GAME - 1000)");

		int playerInput = scanner.nextInt();
		int ComputerChoice = (int)(Math.random()*2);

		String Player = getChoiceName(playerInput);
		
		if(playerInput == 1000) {
			System.exit(0);
		} else {
			String CPU = getChoiceName(ComputerChoice);
			System.out.println("Player: " + Player + " | CPU: " + CPU);

			if(game[playerInput][ComputerChoice] == "P"){
				System.out.println("Player wins");
			} else if(game[playerInput][ComputerChoice] == "C"){
				System.out.println("CPU wins");
			} else {
				System.out.println("Draw");
			}
			
			initPlay();
		}
	}
  
	public static String getChoiceName(int ChoiceNumber) {
		String ChoiceName = "";
		
		if(ChoiceNumber == 0){
			ChoiceName = "ROCK";
		} else if(ChoiceNumber == 1){
			ChoiceName = "PAPER";
		} else if(ChoiceNumber == 2){
			ChoiceName = "SCISSOR";
		}
		
		return ChoiceName;
	}
}