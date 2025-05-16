package week3.day2;

public class Button extends WebElement{
	//subclass extends superclass
	public void Submit() {
		System.out.println("Click Submit");
	}

	public static void main(String[] args) {
		Button B=new Button();
		B.Submit();

	}

}
	