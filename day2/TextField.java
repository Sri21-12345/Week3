package week3.day2;

public class TextField extends WebElement {
//subclass extends from superclass
	//method1
	public void getText() {
		//System.out.println(name);
	}
	public static void main(String[] args) {
		TextField Text=new TextField();
		//call SuperClass
		Text.setText("name");
	}
}