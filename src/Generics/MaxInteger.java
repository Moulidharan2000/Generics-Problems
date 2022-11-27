package Generics;

import java.util.Scanner;

public class MaxInteger<T extends Comparable<T>> {
	
	T x, y, z;
	
	public void MaximumTest(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public T maximum() {
		return MaxInteger.maximum(x, y, z);
	}
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	
	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Max of %s, %s and %s is %s\n",x , y,z, max);
	}
	
	@SuppressWarnings({ "rawtypes", "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Integer xInt = scan.nextInt();
		Integer yInt = scan.nextInt();
		Integer zInt = scan.nextInt();
		MaxInteger.maximum(xInt , yInt , zInt );
		new MaxInteger().maximum();
	}
}
