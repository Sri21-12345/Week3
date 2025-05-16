package week3.day2;

public class Chrome extends Browser 
//subclass extends superclass
{
	//Method1
	public void openIncognito() {
	System.out.println(browser1+ " "+ "openURL");
	}
	//Method2
	public void clearCache() {
		System.out.println(browser1+ " "+"cache is cleared");
	}
		public static void main(String[] args) {
			Chrome browser=new Chrome();
			browser.clearCache();
			browser.openIncognito();
		    browser.navigateBack();

	}	
		}
