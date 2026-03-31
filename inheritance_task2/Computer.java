class Computer{

    void install(Browser browser){
        System.out.println("Executing install in Computer...");
		if(browser != null){
        browser.open(); 
		}
		else{
			System.out.println("browser is null...");
		}
		
		 if (browser instanceof ChromeBrowser){
            ChromeBrowser chrome=(ChromeBrowser) browser;
            chrome.fastOpen();
        }
		
		if (browser instanceof MobileChromeBrowser){
            MobileChromeBrowser mobile=(MobileChromeBrowser) browser;
            mobile.offline();
		}
	
    }
}