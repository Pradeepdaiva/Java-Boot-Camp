package com.thirdware.loopingstatement;

public class LoopStatement {
	int n;
  public LoopStatement(int i){
	   this.n=i;
   }
  public void whileLoop() {
	  System.out.println("Print tables:");
	  for(int i=1;i<=10;i++)  {
		  System.out.println(n +" * "+i+" = "+(n*i));
	  }
  }
  public void forLoop(int a) {
	  int n=0,s=0;
	  int temp=a;
	  if(a>=10) {
	   while(a>0) {
		  n=a%10;
		  s=(s*10)+n;
		  a=a/10;
	  }
	  }
	  if(s==temp) {
		  System.out.println("Given number "+s+" is Palindrome");
	  }else {
		  System.out.println("Given number "+temp+" is not Palindrome");
	  }
  }
	
  public void pattern(int l,int n) {
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
