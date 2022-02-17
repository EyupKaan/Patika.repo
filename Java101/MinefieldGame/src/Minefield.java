import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Minefield {
	
	Scanner sc = new Scanner(System.in);
	Random rnd = new Random();
	
	int row, col, mine;
	boolean isGameOver = false;
	String field[][];
	String gameBoard[][];
	
	public Minefield(int row, int col) {
		super();
		this.row = row;
		this.col = col;
		this.field = new String[row][col];
		this.gameBoard = new String[row][col];
		Board(row, col);
	}

	public void Board(int row, int col) {
		
		mine = (col * row) / 4;
		
		int count = 0;
		int x, y;
		
		for (String[] strings : field) {
			Arrays.fill(strings, "-");
		}
		
		while(count < mine) {
			x = rnd.nextInt(col);
			y = rnd.nextInt(row);
			
			if(this.field[y][x] != "*") {
				this.field[y][x] = "*";
				count++;
			}
			
		}
		
		for (String[] strings : gameBoard) {
			Arrays.fill(strings, "-");
		}
		
	}
	
	public void showField() {
		
		for (String[] i : this.field) {
			for (String j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
			
	}
	
	public void gameBoard() {
		System.out.println("^^^^^^^^^^^^^^^");
		for (String[] strings : this.gameBoard) {
			for (String string : strings) {
				System.out.print(string+" ");
			}
			System.out.println();
		}
		
	}
	
	public boolean isMine() {
		boolean isMine = true;
		for(int i = 0; i < gameBoard.length; i++) {
			for(int j = 0; j < gameBoard[0].length; j++) {
				if(gameBoard[i][j] == "-" && field[i][j] == "-") {
					isMine = false;
					break;
				}
			}
		}
		return isMine;
	}
	
	public void userMove(int r, int c) {
		int count = 0;
		
		if(field[r][c] == "*") {
			this.isGameOver = true;
		}
		
		else {
			/*
			if(field[r][c-1] == "*") count++;
			if(field[r][c+1] == "*") count++;
			if(field[r-1][c-1] == "*") count++;
			if(field[r-1][c] == "*") count++;
			if(field[r-1][c+1] == "*") count++;
			if(field[r+1][c] == "*") count++;
			if(field[r+1][c-1] == "*") count++;
			if(field[r+1][c+1] == "*") count++;
			 */	
		
			if (r - 1 >= 0) {
                if (field[r - 1][c] == "*") count++;
                
            }
            if ((r - 1 >= 0) && (c - 1 >= 0)) {
                if (field[r - 1][c - 1] == "*") count++;
                
            }
            if (c - 1 >= 0) {
                if (field[r][c - 1] == "*") count++;
                
            }
            if (c + 1 < col) {
                if (field[r][c + 1] == "*") count++;
                
            }
            if ((c + 1 < col) && (r + 1 < row)) {
                if (field[r + 1][c + 1] == "*") count++;
                
            }
            if (r + 1 < row) {
                if (field[r + 1][c] == "*")  count++;
                
            }
            if ((r - 1 >= 0) && (c + 1 < col)) {
                if (field[r- 1][c + 1] == "*") count++;
                
            }
            if ((r + 1 < row) && (c - 1 >= 0)) {
                if (field[r + 1][c - 1] == "*") count++;
                
            }
			
			
			
		
			
		}
		this.gameBoard[r][c] = String.valueOf(count);
	}
	
	public void Exe() {
		showField();
		while(!isGameOver) {
			gameBoard();
			System.out.print("Row : ");
			int usrRow = sc.nextInt();
			System.out.print("Collumn : ");
			int usrCol = sc.nextInt();
			if( usrCol >= col || usrCol < 0) {
				System.out.println("Wrong Collumn.");
				continue;
			}
			if( usrRow >= row || usrRow < 0) {
				System.out.println("Wrong Row.");
				continue;
			}
			
			userMove(usrRow, usrCol);
			if(isMine()) {
				System.out.println("WON");
				break;
			}
		}
		if(isGameOver) {
			System.out.println("MINE");
			showField();
		}
	}
	
	
}