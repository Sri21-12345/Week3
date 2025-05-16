package week3.day1;

public class Oddindex {
	public static void main(String[] args) {
		String test = "changeme";
		int len = test.length();
		//for loop
		for (int i = 0; i < len; i++) {
		    char str = test.charAt(i);
		    //if condition
		    if (i % 2 == 0) {
		        System.out.print(Character.toLowerCase(str));
		    } else {
		        System.out.print(Character.toUpperCase(str));
		    }
		}
		
		}
	}


	