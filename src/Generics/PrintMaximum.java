package Generics;

public class PrintMaximum <T extends Comparable<T>>{
		private T[] inputArray;

		PrintMaximum(T[] inputArray) {
	            this.inputArray = inputArray;
	        }

	        public void  testMaximum() {
	            for(int i=0; i<inputArray.length-1; i++) {
	                if(inputArray[i].compareTo(inputArray[i+1]) > 0) {
	                    inputArray[i+1] = inputArray[i];
	                }
	            }
	        }
	        
	    private void toPrint() {
	        System.out.println("Maximum Values : "+inputArray[inputArray.length - 1]);
	    }
	    
		public static void main(String[] args) {
			Integer[] integer = {15,32,45};
	        String[] string = {"Peach","Banana","Apple"};
	        Float[] floats = {15.1f,32.2f,45.3f};
	        new PrintMaximum(integer).testMaximum();
	        new PrintMaximum(string).testMaximum();
	        new PrintMaximum(floats).testMaximum();
	        new PrintMaximum(integer).toPrint();
	        new PrintMaximum(string).toPrint();
	        new PrintMaximum(floats).toPrint();
		}
}
