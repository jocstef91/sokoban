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
		
		
		while(!endGame(soko)) {
			System.out.print("Odigrajte potez");
			String move = s.next();
			
			makeAMove(move, soko);
			print(soko);
			System.out.println();
		}
		System.out.println("Kraj Igre");

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
				
				
				if(i-1>=0 && !table[i-1].equals("X")) {
					if(table[i-1].equals("B")) {
						table[i]= " ";
						i=i-1;
						table[i]= "U";
						table[i-1]="B";
					}else {
						table[i]= " ";
						i=i-1;
						table[i]= "U";
					}
				}else {
						System.out.println("Nevalidan potez");
				}
			}
		}
			break;
			
		case "d":

			for (int i = 0; i < table.length; i++) {
				if(table[i].equals("U")) {
					
					
					if(i+1>=0 && !table[i+1].equals("X")) {
						if(table[i+1].equals("B")) {
							table[i]= " ";
							i=i+1;
							table[i]= "U";
							table[i+1]="B";
						}else {
							table[i]= " ";
							i=i+1;
							table[i]= "U";
						}
					}else {
							System.out.println("Nevalidan potez");
					}
				}
			}
			
			
			
		break;

		case "w":
			for (int i = 0; i < table.length; i++) {
				if(table[i].equals("U")) {
					
					
					if(i-5>=0 && !table[i-5].equals("X")) {
						if(table[i-5].equals("B")) {
							table[i]= " ";
							i=i-5;
							table[i]= "U";
							table[i-5]="B";
						}else {
							table[i]= " ";
							i=i-5;
							table[i]= "U";
						}
					}else {
							System.out.println("Nevalidan potez");
					}
				}
			}
		break;
		
		case "s":
		
			for (int i = 0; i < table.length; i++) {
				if(table[i].equals("U")) {
					
					
					if(i+5<=table.length-1 && !table[i+5].equals("X")) {
						if(table[i+5].equals("B")) {
							table[i]= " ";
							i=i+5;
							table[i]= "U";
							table[i+5]="B";
						}else {
							table[i]= " ";
							i=i+5;
							table[i]= "U";
						}
					}else {
							System.out.println("Nevalidan potez");
					}
				}
			}
			
		break;
		
		default:
			System.out.println("Uneli ste nevalidnu vrednost");
			break;
		}
	}
	


}
