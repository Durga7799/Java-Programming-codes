import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    	System.out.print("Enter the no.of Pizzas bought:");
	int pizzas=sc.nextInt();
		System.out.print("Enter the no.of Puffs bought:");
		int puffs=sc.nextInt();
			System.out.print("Enter the no.of CoolDrinks bought:");
			int coolDrinks=sc.nextInt();
				System.out.println("No of Pizzas:"+pizzas);
					System.out.println("No of Puffs:" +puffs );
						System.out.println("No of pizzas:"+coolDrinks);
						int totalPrice=((100*pizzas)+(20*puffs)+(10*coolDrinks));
							System.out.print("Total Price:"+totalPrice);
	}
}
