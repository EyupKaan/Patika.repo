
public class Transpose {
	
	public static void transpose(int arr[][]) {
		
		int trans[][] = new int[arr[0].length][arr.length];
		
		for(int i = 0; i < arr[0].length; i++) {
			for(int j = 0; j < arr.length; j++) {
				trans[i][j] = arr[j][i];
			}
		}
		
		for (int[] row : trans) {
			for (int col : row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12},
				{13,14,15},
				{16,17,18}
				};
		
		
		transpose(arr);
				
	}
	
}
