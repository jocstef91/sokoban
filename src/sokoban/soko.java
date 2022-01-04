package sokoban;
import java.util.Scanner;
public class soko {

	
	public static void main(String[] args) {
		String [] soko = { "U"," "," "," "," "
						  ," ","B","X"," "," "
						  ," "," ","X"," "," "
						  ," "," "," "," "," "
						  ," "," "," "," ","E"};
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("  SOKOBAN");
		print(soko);
		
		System.out.print("Odigrajte potez");
		
		
		while(!endGame(soko)) {
			System.out.print("Odigrajte potez");
			String move = s.next();
			
			makeAMove(move, soko);
			print(soko);
		}

	}
	
	public static void print(String [] table) {
		
		
			int i =0;
				for(int j = 0; j<table.length/5; j++) {
					System.out.print("|" + table[i]);
					i++;
					System.out.print("|" + table[i]);
					i++;
					System.out.print("|" + table[i]);
					i++;
					System.out.print("|" + table[i]);
					i++;
					System.out.print("|" + table[i]);
					i++;
					System.out.println("|");
				}
			
	}
	
	public static boolean endGame(String [] table) {
		
		if(table[table.length-1].equals("B")) {
			return true;
		}
		return false;
	}
	
	public static void makeAMove(String move, String [] table) {
		
		switch (move) {
		case "a":
				for (int i = 0; i < table.length; i++) {
					if(table[i].equals("U")) {
						table[i]= " ";
						i--;
						table[i]= "U";
					}
				}
			break;
			
		case "d":
			for (int i = 0; i < table.length; i++) {
				if(table[i].equals("U")) {
					table[i]= " ";
					i++;
					table[i]= "U";
				}
			}
		break;

		case "w":
			for (int i = 0; i < table.length; i++) {
				if(table[i].equals("U")) {
					table[i]= " ";
					i=i-5;
					table[i]= "U";
				}
			}
		break;
		
		case "s":
			for (int i = 0; i < table.length; i++) {
				if(table[i].equals("U")) {
					table[i]= " ";
					i=i+5;
					table[i]= "U";
				}
			}
		break;
		
		default:
			System.out.println("Uneli ste nevalidnu vrednost");
			break;
		}
	}

}
