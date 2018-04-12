import java.util.Scanner;

public class APP2 {
	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		double avg = 0;
		int[] a = new int[n];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			a[i] = m;
			sum += a[i];
		}
		
		for(int i = n - 1; i >= 0; i--){  
            System.out.println(a[i]);  
        }
		
		avg = sum / n;
		System.out.println(avg);
	}
}
