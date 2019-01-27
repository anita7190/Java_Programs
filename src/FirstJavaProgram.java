import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FirstJavaProgram {

	public static void main(String[] args) {
		
		System.out.println("Please Enter multiple inputs of minutes separated by comma or space :");
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList();
		
		
		while(true)
		{
			
			String s = in.nextLine();
			try
			{
				String a[] = s.split("[, ]+");
				for (String temp : a)
				{
				int z = Integer.parseInt(temp);
				input.add(z);
				}
				break;
			}
			
			catch(Exception e)
			{
				System.out.println("Invalid Input..Please Enter Valid Inputs Again separated by comma or space..");
				input.clear();
				
			}
		}
		
		Iterator itr = input.iterator();
		while(itr.hasNext())
		{
			int x = (int) itr.next();
			int years = (x/525600);
			int days = (int)(x%525600)/1440;
			int hours = (int)((x%525600)%1440)/60;
			int mins =(int)((x%525600)%1440)%60;
			
			System.out.println(x+" minutes = "+ years + " years, " + days + " days, "
			+hours +" hours, "+ mins +" mins");
		}

     }
}
