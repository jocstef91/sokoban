package sokoban;

public class soko {

	public static void main(String[] args) {
		String [] soko = { "U"," "," "," "," "
						  ," ","B","X"," "," "
						  ," "," ","X"," "," "
						  ," "," "," "," "," "
						  ," "," "," "," ","E"};
		
		System.out.println("  SOKOBAN");
		print(soko);
		

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
	
	public static boolean endGame(String move, String [] table) {
		
		if(table(table.length-1).equals("B")) {
			return true;
		}
		return false;
	}

}
