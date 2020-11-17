
public class Task5 {

	public static void main(String[] args) {
		int l=4;
		int n=4;
		int d=1;
		for(int i=0;i<l;i++) {
		for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				if(d==10) {
					System.out.print(" "+ d);
				  }else {
					  System.out.print(" "+d);
				  }
				d=d-1;
			}
			if(d==0) {
				d=d+3;
			}else if(d==1) {
				d=d+5;
			}else if(d==3){
				d=d+7;
			}else if(d==6 && l==5) {
				d=d+9;
			}
			System.out.println();
			n--;
			
	}
		d=d+l;
		for(int i=l;i>0;i--) {
			for(int j=0;j<=n;j++) {
					System.out.print(" ");
				}
				for(int k=0;k<i;k++) {
					System.out.print(" "+d--);
				}
				System.out.println();
				n++;
		}
	}
		}


