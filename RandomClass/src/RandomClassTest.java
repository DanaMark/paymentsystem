
public class RandomClassTest {

	public static void main(String[] args) {
		int[][] table= new int [6][2];
		for(int row = 0; row < table.length; row++){
		    for(int column = 0; column < table[row].length; column++){
		        int r =(int)(Math.random()*(9-1+1))+1;
		        (int)(Math.random()*9)+1;
		        table[row][column]=r;
		        System.out.println(table[row][column]);
		    }
		
		}
	}

}
