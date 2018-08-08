package com.hung.backtracking;

public class AnalysisNumerical {

	static int n=10;
	static int[] x = new int[1000];
	static int[] t = new int[1000];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x[0]=1;
		t[0]=0;
		Try(1);
	}
	
	public static void Try(int i) {
		for(int j=x[i-1]; j<= (int) (n-t[i-1])/2 ;j++){
			x[i]=j;
			t[i]=t[i-1]+j;
			Try(i+1);
		}
		x[i]=n-t[i-1];
		print(i);
	}

	private static void print(int k) {
		for(int i=1; i<k; i++) {
			System.out.print(x[i]+"+");
		}
		System.out.print(x[k]);
		System.out.println();
	}

}