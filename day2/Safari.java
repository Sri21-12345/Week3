package week3.day2;

	public class Safari extends Browser {
		//subclass extends superclass
		//Method1
		public void readerMode() {
			System.out.println(browser3+" "+"The Reader Mode is activated");
		}
		//Method2
		public void fullScreenMode() {
			System.out.println(browser3+" "+"The full Screen Mode is Activated");
		}
	public static void main(String[] args) {
		Safari browser=new Safari();
		browser.readerMode();
		browser.fullScreenMode();
		browser.closeBrowser();
	}

}
