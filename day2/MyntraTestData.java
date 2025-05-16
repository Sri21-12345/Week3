package week3.day2;

public class MyntraTestData extends Testdata {
	//subclass extends superclass
	//Method1
	public void enterUsername() {
		System.out.println("Enter username from MyntraTestData");
	}
	//Method2
	public void enterPassword() {
		System.out.println("Enter password from MyntraTestData");
	}
	public static void main(String[] args) {
		MyntraTestData Myntra = new MyntraTestData();
		Myntra.enterUsername();
		Myntra.enterPassword();
		Myntra.enterCredentials();
		Myntra.navigateToHomePage();
	}
}