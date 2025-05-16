package week3.day2;

public class RadioButton extends Button {
	//another subclass extends subclass
	public void selectRadioButton() {
		System.out.println("Radio Button is clicked");
			}
			public static void main(String[] args) {
				RadioButton radio=new RadioButton();
				radio.selectRadioButton();
											}
		}