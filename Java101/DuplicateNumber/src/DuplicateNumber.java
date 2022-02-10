
public class DuplicateNumber {
	
	static boolean isFind(int[] arr, int value) {
		
		for (int i : arr) {
			if ( i == value) {
				return true;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {

		int arr[] = {1, 2, 34, 1, 3, 4, 5, 3, 6, 7, 8, 15, 8, 9, 10, 34};
		int duplicateArr[] = new int[arr.length];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++ ) {
				if(i != j && arr[i] == arr[j]) {
					if(!isFind(duplicateArr, arr[i])) {
						
						duplicateArr[index++] = arr[i];
						
					}
				}
			}
		}
		
		for (int i : duplicateArr) {
			if(i != 0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
