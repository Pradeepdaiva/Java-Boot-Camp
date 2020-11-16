import java.util.Scanner;
public class Task2 {

	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int n=str.length();
		boolean check=true;
		for(int i=0;i<str.length();i++,n--) {
			if(str.charAt(i)!=str.charAt(n-1)) {
				check=false;
			}
		}
		if(check) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		scan.close();
	}
}
