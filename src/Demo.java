import java.util.Date;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("111:");
		String word = sc.nextLine();
		float count = 0F;
		float num = 0F;
		long cc = 0L;
		long dd = 0L;
		Date date = new Date();
		date.toString();
	
		if(word.endsWith("e")){
			System.out.println("222:" + word + "d");
		}else{
			System.out.println("333:" + word + "ed");
		}
		
		System.out.println("444:" + word + "ing");
	}
}
