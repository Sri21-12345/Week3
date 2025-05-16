package week3.day1;

public class Duplicatecheck {

	public static void main(String[] args) {
		int[] num1 = {2,5,7,7,5,9,2,3};
		System.out.println("Duplicate values in array");
		//for loop
		for (int i = 0; i < num1.length-1; i++) {
			for (int j = i+1; j < num1.length; j++) {
				//if condition
			if (num1[i] == num1[j])
			{
				System.out.println(num1[i]);
			
		}
			}
		}
	}
}
	
