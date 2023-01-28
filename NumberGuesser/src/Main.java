import java.util.Scanner;

class Gusser{
	
	int guessNum;
	
	int guessNumber(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("guesser guess the number");
		guessNum = sc.nextInt();
		
		return guessNum;
	}
}

class Player {
	
	int guessNum;
	
	int guessNumber(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Player guess the number");
		guessNum = sc.nextInt();
		
		return guessNum;
	}
}


class Umpire{
	int numFromGusser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void gussedNumFromGusser() {
		Gusser gs = new Gusser();
		numFromGusser = gs.guessNumber();
	}
	
	void gussedNumFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromPlayer1 = p1.guessNumber();
		numFromPlayer2 = p2.guessNumber();
		numFromPlayer3 = p3.guessNumber();
	}
	
	/*
	 * for normal game
	 
	void compare() {
		if(numFromGusser == numFromPlayer1) {
			System.out.println("Player1 has won the game");
		}else if(numFromGusser == numFromPlayer2) {
			System.out.println("Player2 has won the game");
		}else if(numFromGusser == numFromPlayer3) {
			System.out.println("Player3 has won the game");
		}else {
			System.out.println("you all lost the game ! Try again !");
		}
	}
	
	*
	*/
	
	void compare() {
		if(numFromGusser == numFromPlayer1) {
			if(numFromGusser == numFromPlayer2 && numFromGusser == numFromPlayer3) {
				System.out.println("game tie among palyer1, player2 and player3");
			}else if( numFromGusser == numFromPlayer2) {
				System.out.println("game tie between player1 and player2");
			}else if( numFromGusser == numFromPlayer3) {
				System.out.println("game tie between player1 and player3");
			}else {
				System.out.println("Player1 has won the game");
			}
		}else if(numFromGusser == numFromPlayer2) {
			if(numFromGusser == numFromPlayer3) {
				System.out.println("gane tie between player2 and player3");
			}else {
				System.out.println("Player2 has won the game");
			}
		}else if(numFromGusser == numFromPlayer3) {
			System.out.println("Player3 has won the game");
		}else {
			System.out.println("you all lost the game ! Try again !");
		}
	}
}



public class Main {
	public static void main(String[] args) {
		Umpire  up = new Umpire();
		
		up.gussedNumFromGusser();
		up.gussedNumFromPlayer();
		up.compare();
	}
}
