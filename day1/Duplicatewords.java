package week3.day1;
public class Duplicatewords {
public static String removeduplicates(String Text) {
	//string to split
	String[] count =Text.split(" ");
	//for loop
	for (int i = 0; i < count.length; i++) {
		//if condition
		if (count[i]!=" ") {
			//for loop		
		for (int j = i+1; j < count.length; j++) {
			//if condition
			if (count[i].equals(count[j])) {
				count[j]=" ";
				count[i]=" ";
			} }
		} }
	//for loop
		for (int k = 0; k < count.length; k++) {
			if (count[k]!=" ") {
				System.out.print(count[k]+" ");
			} }
		return (Text); }
	
public static void main(String[]args) {
	System.out.println("We learn Java Basics as part of java sessions in java week1");
	String Text= "We learn Java Basics as part of java sessions in java week1";
	Duplicatewords.removeduplicates(Text);
			}
			}
	

	