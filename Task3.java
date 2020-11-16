
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=4;
		int n=4;
		for(int i=0;i<l;i++) {
		for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
			n--;
	}
		for(int i=l;i>0;i--) {
			for(int j=0;j<=n;j++) {
					System.out.print(" ");
				}
				for(int k=0;k<i;k++) {
					System.out.print("* ");
				}
				System.out.println();
				n++;
		}
	}
		}


