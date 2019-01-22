import java.util.Scanner;

public class FirstJavaProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter multiple inputs of minutes separated by comma or space :");
		String input = sc.nextLine();
		
		
		String a[] = input.split("[, ]+");
		for (String temp : a)
		{
		int x = Integer.parseInt(temp);
		int years = (int)(x/525600);
		int days = (int)(x%525600)/1440;
		int hours = (int)((x%525600)%1440)/60;
		int mins =(int)((x%525600)%1440)%60;
		
		System.out.println(x+" minutes = "+ years + " years, " + days + " days, "
		+hours +" hours, "+ mins +" mins");
		}
		

     }
}