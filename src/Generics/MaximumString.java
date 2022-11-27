package Generics;

public class MaximumString<A extends Comparable<A>> {

	A st1 , st2 , st3 ;
	
	public MaximumString (A st1 , A st2 , A st3) {
		this.st1 = st1;
		this.st2 = st2;
		this.st3 = st3;
	}
	
	public A max() {
		return MaximumFloat.max(st1 , st2 , st3); 
	}
		
	public static <A extends Comparable<A>> A max(A st1, A st2, A st3) {
		A max = st1 ;
		
		if(st2.compareTo(max) > 0) {
			max = st2;
		}
		if (st3.compareTo(max) > 0) {
			max = st3;
		}
		 printMax(st1, st2, st3, max);
		return max;
	}

	public static <A> void printMax(A st1, A st2, A st3, A max) {
		System.out.println("Maximum of "+st1+" , "+st2+" , "+st3+" , is "+max);	
	}
	
	public static void main(String[] args) {
		String st1 = "Apple" ;
		String st2 = "Mango" ;
		String st3 = "Orange";
		
		new MaximumString(st1, st2, st3).max();

	}
}
