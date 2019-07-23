import java.util.Scanner;

public class Do_while {
	public static void  main(String... args){
		Scanner in =new Scanner(System.in);
		System.out.println("password plz");
		String str =in.nextLine();

		while(!str.equals("abc")){
			System.out.println("password error");
			str=in.nextLine();
			}
		System.out.println("OK!");
	}
}
