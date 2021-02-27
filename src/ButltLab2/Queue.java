package ButltLab2;
import java.util.*;

public class Queue {
	// TODO Auto-generated method stub
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		undsenUildel();
        System.out.println("Bayarlalaa");
	}
	static void undsenUildel() {
		boolean switchloop = true;
		while(switchloop) {
			System.out.println("Ugudliin torortei hargalzah too oruulna \n1 - > Integer\n2 - > String");
			String str= sc.nextLine();
			switch(str) {
			case "1":
				inteGer(hemjeeOnooh());
				switchloop = false;
				break;
			case "2":
				stringer(hemjeeOnooh());
				break;
			default:
				System.out.println("1,2s songono");
			}
		}
	}
	static int tooeseh(String bichver) {
		int d=0;
		boolean tooeseh = false;
		while(!tooeseh) {
			System.out.println(bichver+"-g oruulna uu");
			String str= sc.nextLine();
			if (str == null) {
		        System.out.println(bichver+"-g oruulna uu");
		    }
		    try {
		        d = Integer.parseInt(str);
		        tooeseh = true;
		    } catch (NumberFormatException nfe) {
		        System.out.println("Zovhon too oruulna uu");
		    }
		}
		return d;
	}
	static int hemjeeOnooh() 
	{
		return tooeseh("Hemjee");
	}
	static void inteGer(int size) {// e torliin integer torol, string-tei yag adilhan
		Array<Integer> lab = new Array(size);
		String text = "Commandiin dugaar:\n\t1 - > Nemeh\n\t2 - > Hasah\n\t3 - > Harah\n\t4 Haih";
		System.out.println(text);
		while(0<1) {
			switch(tooeseh("Commandiin dugaaraa oruulna uu, Commandiin dugaariig ahin harah bol 5iig oruulna")) 
			{
			case 1:
				System.out.println(lab.nemeh(tooeseh("Nemeh")));
				break;
			case 2:
				System.out.println(lab.hasah());
				break;
			case 3:
				System.out.println(lab.bugdHarah());
				break;
			case 4:
				System.out.println(lab.haih(tooeseh("Haih")));
				break;
			case 5:
				System.out.println(text);
				break;
			default:
				System.out.println("Zovhon 1-4 hooron oruulna uu");
				break;
			}
		}
	}
	static void stringer(int size) {// e torliin String torol
		Array<String> lab = new Array(size);
		String text = "Commandiin dugaar:\n\t1 - > Nemeh\n\t2 - > Hasah\n\t3 - > Harah";
		System.out.println(text);
		while(0<1) {
			switch(tooeseh("Commandiin dugaaraa oruulna uu, Commandiin dugaariig ahin harah bol 5iig oruulna")) 
			{
			case 1:
				System.out.println(lab.nemeh(str("Nemeh")));
				break;
			case 2:
				System.out.println(lab.hasah());
				break;
			case 3:
				System.out.println(lab.bugdHarah());
				break;
			case 4:
				System.out.println(lab.haih(str("Haih")));
				break;
			case 5:
				System.out.println(text);
				break;
			default:
				System.out.println("Zovhon 1-4 hooron oruulna uu");
				break;
			}
		}
	}
	static String str(String zorilgo) {//integer utga avan butsaadag function
		boolean bool=false;
		String as = "";
		while(bool) {
			try{
				System.out.println(zorilgo + " utgaa oruulna uu");
				as = sc.nextLine();
			}
			catch(Exception ex)
			{
				System.out.println("Useg oruulna uu!");
			}
			
		}
		return as;
	}
}
