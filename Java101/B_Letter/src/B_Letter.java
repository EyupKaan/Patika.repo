
public class B_Letter {

	public static void main(String[] args) {

		String[][] B = new String[9][4];

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                if (i == 0 || i == 4 || i == 8) {
                    B[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    B[i][j] = " * ";
                } else {
                    B[i][j] = "   ";
                }
            }
        }

        for (String[] row : B){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
		
	}

}
