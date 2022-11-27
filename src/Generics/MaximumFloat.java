package Generics;

import java.util.Scanner;

public class MaximumFloat <K extends Comparable<K>> {
	
	K fv1 , fv2 , fv3 ;
	
	public MaximumFloat (K fv1 , K fv2 , K fv3) {
		this.fv1 = fv1;
		this.fv2 = fv2;
		this.fv3 = fv3;
	}
	
	public K max() {
		return MaximumFloat.max(fv1 , fv2 , fv3); 
	}
		
	public static <K extends Comparable<K>> K max(K fv1, K fv2, K fv3) {
		K max = fv1 ;
		
		if(fv2.compareTo(max) > 0) {
			max = fv2;
		}
		if (fv3.compareTo(max) > 0) {
			max = fv3;
		}
		 printMax(fv1, fv2, fv3, max);
		return max;
	}

	public static <K> void printMax(K fv1, K fv2, K fv3, K max) {
		System.out.println("\nMaximum of "+fv1+" , "+fv2+" , "+fv3+" , is "+max);	
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float fv1 = scan.nextFloat();
		float fv2 = scan.nextFloat();
		float fv3 = scan.nextFloat();
		
		new MaximumFloat(fv1, fv2, fv3).max();

	}

}
