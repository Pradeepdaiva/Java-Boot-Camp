import java.util.*;
public class Task6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] a= {7,2,11,8,17,10,27,16};
		int k=1;
		List<Integer> list=new ArrayList<>();
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		for(int b:a) {
			if(b%2!=0) {
			list.add(b);
		}else {
			list1.add(b);
		}
		}
		for(int i=list.size()-1;i>=0;i--) {
			list2.add(list.get(i));
		}
		for(int i=0;i<list1.size();i++) {
			list2.add(k,list1.get(i));
			k=k+2;
		}
		System.out.println(list2);
scan.close();
	}

}
