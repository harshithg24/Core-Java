public class ApplicationStarter {

	public static void main(String[] args) {
		
	    Application app = new Application("A001","Social media",AppType.WEB_APPLICATION,2.1f,"ALLwin","10/10/2015");
		System.out.println("Application id:"+app.id);
		System.out.println("Application name:"+app.name);
		System.out.println("Type:"+app.type);
		System.out.println("Version:"+app.version);
		System.out.println("Developer:"+app.developer);
		System.out.println("Date:"+app.date);
		app.run();
		app.stop();
		app.execute();
		app.collectInfo();
		app.displayInfo();
		
		System.out.println("------------------------------------------------------------------------------");
		
		StandaloneApplication stand = new StandaloneApplication("S001","Word Processing Software",AppType.STANDALONE_APPLICATION,21,"Bill Gates","1975",2,"Office suite",Os.WINDOWS);
		System.out.println("Application id:"+stand.id);
		System.out.println("Application name:"+stand.name);
		System.out.println("Type:"+stand.type);
		System.out.println("Version:"+stand.version);
		System.out.println("Developer:"+stand.developer);
		System.out.println("Date:"+stand.date);
		System.out.println("Size in GB:"+stand.size);
		System.out.println("Compatible with:"+stand.compatibleWith);
		System.out.println("OS:"+stand.type1);
		stand.run();
		stand.stop();
		stand.execute();
		stand.collectInfo();
		stand.displayInfo();
		stand.ConsumerMemory();
		stand.consumerInternet();
		
		System.out.println("------------------------------------------------------------------------------");
		
		SupportedBrowsers support = new SupportedBrowsers("Google chrome");
        SupportedBrowsers support1 = new SupportedBrowsers("Mozilla Firefox");
        SupportedBrowsers support2 = new SupportedBrowsers("Microsoft Edge");
        SupportedBrowsers support3 = new SupportedBrowsers("Apple Safari");
        SupportedBrowsers support4 = new SupportedBrowsers("Opera");
        
        SupportedBrowsers[] supb = {support,support1,support2,support3,support4};
        
        WebApplication web = new WebApplication("W101","Amazon",AppType.WEB_APPLICATION,22.3f,"Jeff Bezos","2010",supb,true);
        
        System.out.println("Application id:"+web.id);
		System.out.println("Application name:"+web.name);
		System.out.println("Type:"+web.type);
		System.out.println("Version:"+web.version);
		System.out.println("Developer:"+web.developer);
		System.out.println("Date:"+web.date);
		System.out.println("Free:"+web.free);
		System.out.println("Supported browser:"+web.browser);
		
		web.run();
		web.stop();
		web.execute();
		web.collectInfo();
		web.displayInfo();
		web.connectInternet();
		web.sendUsage();
		
		System.out.println("------------------------------------------------------------------------------");
		
		Downloads down = new Downloads("Document");
		Downloads down1 = new Downloads("Image");
		Downloads down2 = new Downloads("pdf");
		Downloads down3 = new Downloads("Song");
		
		Downloads[] downl = {down,down1,down2,down3};
		
		BrowsingHistorySites browhis = new BrowsingHistorySites("www.Google.com");
		BrowsingHistorySites browhis1 = new BrowsingHistorySites("www.facebook.com");
		BrowsingHistorySites browhis2 = new BrowsingHistorySites("www.Flipkart.com");
		BrowsingHistorySites browhis3 = new BrowsingHistorySites("www.netflix.com");
		
		BrowsingHistorySites[] browh = {browhis,browhis1,browhis2,browhis3};
		
        Browser browser = new Browser("B101","Chrome",AppType.STANDALONE_APPLICATION,30.2f,"Bill Gates","2011",10,"Browser Comptability",Os.WINDOWS,downl,browh);
        
        System.out.println("Application id:"+browser.id);
		System.out.println("Application name:"+browser.name);
		System.out.println("Type:"+browser.type);
		System.out.println("Version:"+browser.version);
		System.out.println("Developer:"+browser.developer);
		System.out.println("Date:"+browser.date);
		browser.run();
		browser.stop();
		browser.execute();
		browser.collectInfo();
		browser.displayInfo();
		browser.settings();
		browser.displayHistory();
		browser.ConsumerMemory();
		browser.consumerInternet();
		
		System.out.println("------------------------------------------------------------------------------");
		
		Favourites fav = new Favourites("A.R Rehaman");
		Favourites fav1 =new Favourites("Arjith Singh");
		Favourites fav2 =new Favourites("Sanjeeth Hegde");
		
		Favourites[] favour = {fav,fav1,fav2};
		
		MediaPlayer media = new MediaPlayer("M100","VLC Media Player",AppType.STANDALONE_APPLICATION,5.6f,"James Mark","2004",3,"Windows",Os.WINDOWS,favour);
		System.out.println("Application id:"+media.id);
		System.out.println("Application name:"+media.name);
		System.out.println("Type:"+media.type);
		System.out.println("Version:"+media.version);
		System.out.println("Developer:"+media.developer);
		System.out.println("Date:"+media.date);
		System.out.println("Size in GB:"+media.size);
		System.out.println("Compatible with:"+media.compatibleWith);
		System.out.println("OS:"+media.type1);
		media.run();
		media.stop();
		media.execute();
		media.collectInfo();
		media.displayInfo();
		media.ConsumerMemory();
		media.consumerInternet();
		media.play();
		media.delete();
		media.download();
		
		System.out.println("------------------------------------------------------------");
	
		
		ChromeBrowser chrome = new ChromeBrowser("C101","Fire fox",AppType.STANDALONE_APPLICATION,4.3f,"Antony","2008",2,"WIndows",Os.WINDOWS,downl,browh);
		
		System.out.println("Application id:"+chrome.id);
		System.out.println("Application name:"+chrome.name);
		System.out.println("Type:"+chrome.type);
		System.out.println("Version:"+chrome.version);
		System.out.println("Developer:"+chrome.developer);
		System.out.println("Date:"+chrome.date);
		System.out.println("Size in GB:"+chrome.size);
		System.out.println("Compatible with:"+chrome.compatibleWith);
		System.out.println("OS:"+chrome.type1);
		chrome.run();
		chrome.stop();
		chrome.execute();
		chrome.collectInfo();
		chrome.displayInfo();
		chrome.ConsumerMemory();
		chrome.consumerInternet();
		chrome.settings();
		chrome.displayHistory();
		
		System.out.println("------------------------------------------------------------");
		
		EdgeBrowser edge = new EdgeBrowser("C101","Opera",AppType.STANDALONE_APPLICATION,4.3f,"Marker","2009",2,"WIndows",Os.WINDOWS,downl,browh);
		
		System.out.println("Application id:"+edge.id);
		System.out.println("Application name:"+edge.name);
		System.out.println("Type:"+edge.type);
		System.out.println("Version:"+edge.version);
		System.out.println("Developer:"+edge.developer);
		System.out.println("Date:"+edge.date);
		System.out.println("Size in GB:"+edge.size);
		System.out.println("Compatible with:"+edge.compatibleWith);
		System.out.println("OS:"+edge.type1);
		edge.run();
		edge.stop();
		edge.execute();
		edge.collectInfo();
		edge.displayInfo();
		edge.ConsumerMemory();
		edge.consumerInternet();
		edge.settings();
		edge.displayHistory();
		
		System.out.println("------------------------------------------------------------");
		
		FireFoxBrowser fire = new FireFoxBrowser("C101","",AppType.STANDALONE_APPLICATION,4.3f,"Marker","2009",2,"Windows",Os.WINDOWS,downl,browh);
		
		System.out.println("Application id:"+fire.id);
		System.out.println("Application name:"+fire.name);
		System.out.println("Type:"+fire.type);
		System.out.println("Version:"+fire.version);
		System.out.println("Developer:"+fire.developer);
		System.out.println("Date:"+fire.date);
		System.out.println("Size in GB:"+fire.size);
		System.out.println("Compatible with:"+fire.compatibleWith);
		System.out.println("OS:"+fire.type1);
		fire.run();
		fire.stop();
		fire.execute();
		fire.collectInfo();
		fire.displayInfo();
		fire.ConsumerMemory();
		fire.consumerInternet();
		fire.settings();
		fire.displayHistory();
		
		

	}

}