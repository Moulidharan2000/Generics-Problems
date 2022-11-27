package Generics;

public class MaxFindMoreThanThree <T extends Comparable<T>> {
	
	private T[] inputArray;
	
	MaxFindMoreThanThree(T[] inputArray) {
	
		this.inputArray = inputArray;
	}
	
	public void maxElement() {
		
		for(int i = 0; i<inputArray.length-1; i++) {
			if(inputArray[i].compareTo(inputArray[i+1])>0) {
				inputArray[i+1] = inputArray[i];
			}
		}
		System.out.println(inputArray[inputArray.length-1]);
	}
	
	public void display() {
		for(int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}
	public static void main(String[] args) {
		
		Integer[] integer = {25,58,69,58,78,87};
		String[] string = {"Apple","Orange","Banana","Pear"};
		Float[] floats = {2.5f,0.22f,2.6f,5.6f,8.5f};
		System.out.println("Integer : ");
		new MaxFindMoreThanThree(integer).display();
		System.out.println("String : ");
		new MaxFindMoreThanThree(string).display();
		System.out.println("Flaot : ");
		new MaxFindMoreThanThree(floats).display();
		System.out.println("Maximum From Three Value : ");
		new MaxFindMoreThanThree(integer).maxElement();
		new MaxFindMoreThanThree(string).maxElement();
		new MaxFindMoreThanThree(floats).maxElement();
	}

}
