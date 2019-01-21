import java.util.Scanner;

public class FirstJavaProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter number of minutes:");
		long x = sc.nextLong();
		
		int years = (int)(x/525600);
		int days = (int)(x%525600)/1440;
		int mins =(int)(x%525600)%1440;
		
		System.out.println("Number of Years : " + years);
		System.out.println("Number of days : " + days);
		System.out.println("Number of minutes : " + mins);
	}

}
