package week3.day2;

public class MeeshoTestData extends Testdata{
	//subclass extends superclass
	//Method1
	public void enterUsername() {
		System.out.println("Enter username from MeeshoTestData");
	}
	//Method2
	public void enterPassword() {
		System.out.println("Enter password from MeeshoTestData");
	}
	public static void main(String[] args) {
		MeeshoTestData Meesho = new MeeshoTestData();
		Meesho.enterUsername();
		Meesho.enterPassword();
		Meesho.enterCredentials();
		Meesho.navigateToHomePage();
	}
}
