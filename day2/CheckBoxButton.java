package week3.day2;

public class CheckBoxButton extends Button {
	//additional subclass extends subclass
	public void  clickCheckButton() {
		System.out.println("Click the field using button");
	}
		public static void main(String[] args) {
			CheckBoxButton checkbox=new CheckBoxButton();
			checkbox.clickCheckButton();
		}
	}

