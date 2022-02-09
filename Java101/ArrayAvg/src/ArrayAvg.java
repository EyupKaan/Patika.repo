
public class ArrayAvg {
	
	public static double harmonicAvg(int arr[]) {
		
		double hrmnc = 0;
		
		for (int i : arr) {
			
			hrmnc += 1.0/ i;
			
		}
		
		return hrmnc;
	}

	public static void main(String[] args) {

		int list[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int total = 0;
		
		for(int i = 0; i < list.length; i++) {
			
			total += list[i]; 
		}
		
		
		double avg = total / list.length;
		System.out.println("Normal average = "+avg);
		System.out.println("Harmonic average = "+ 10 / harmonicAvg(list));
		
	}

}
