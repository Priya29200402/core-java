class ComputerRunner{
    public static void main(String[] args){

        Browser browser=new Browser();
		browser.name="Google Chrome";
		System.out.println("Browser Name:"+browser.name);
		browser.open();
	
		System.out.println("\n===========================");
		
        ChromeBrowser chromeBrowser=new ChromeBrowser();
        chromeBrowser.name="Microsoft Edge";
        System.out.println("Browser name:"+chromeBrowser.name);

        chromeBrowser.founder="Microsoft";
        System.out.println("Founder:"+ chromeBrowser.founder);

        chromeBrowser.open();       
        chromeBrowser.fastOpen();   

        System.out.println("\n===========================");

        MobileChromeBrowser mobile=new MobileChromeBrowser();

        mobile.name="FireFox";
        mobile.founder="Blake Ross, Dave Hyatt, and Joe Hewitt";
        mobile.mobileBrand="Samsung";
        System.out.println("Browser name:"+ mobile.name);
        System.out.println("Founder:"+ mobile.founder);
        System.out.println("Mobile Brand:"+ mobile.mobileBrand);

        mobile.open();       
        mobile.fastOpen();  
        mobile.offline();    
		
		Computer computer = new Computer();
		computer.install(browser);
        computer.install(chromeBrowser);  
        computer.install(mobile);         
    }
}