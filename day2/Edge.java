package week3.day2;

public class Edge extends Browser{
	//subclass extends superclass
	//Method1
	public void takesnap()
	{
		System.out.println(browser2 + " " + "Snapshot taken");
	}
	//Method2
	public void clearcookies()
	{
		System.out.println(browser2 + " "+ "The cookies cleared");
	}
	public static void main(String[]args)
	{
		Edge browser=new Edge();
		browser.takesnap();
		browser.clearcookies();
		browser.closeBrowser();
	}
}
