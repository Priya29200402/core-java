class Task9Runner{

    public static void main(String[] args){

        String[] brands = new String[3];
        brands[0]="Nippon";
        brands[1]="Indigo";
		brands[2]="Asian Paints"; 

        Paint paint=new Paint("White", 250);
        Paint paint1=new Paint("Black", 300);
		Paint paint2=new Paint("Red",400);

        Paint[] paints = new Paint[3];
        paints[0]= paint;
        paints[1]= paint1;
		paints[2]=paint2;

        Painter painter = new Painter(brands, paints);
        painter.printInfo();
		
		String[] documents=new String[3];
		documents[0]="Marks Sheet";
		documents[1]="Adhar card";
		documents[2]="Pan Card";
		
		
		Photo photo1=new Photo(16,"PassPort");
		Photo photo2=new Photo(2,"PostCard");
		Photo photo3=new Photo(3,"Small Poster");
		
		Photo[] photo=new Photo[3];
		photo[0]=photo1;
		photo[1]=photo2;
		photo[2]=photo3;
		
		Printer printer=new Printer(documents,photo);
		printer.printInfo();
		
		String[] furnitures = new String[3];
		furnitures[0] = "Sofa";
		furnitures[1] = "Bed";
		furnitures[2] = "Table";

		Wood wood1 = new Wood("Shrigandha",150);
		Wood wood2 = new Wood("Cherry",200);
		Wood wood3 = new Wood("Teak",130);

		Wood[] woods = new Wood[3];
		woods[0] = wood1;
		woods[1] = wood2;
		woods[2] = wood3;

		Carpenter carpenter = new Carpenter(furnitures, woods);
		carpenter.printInfo();
		
		String[] serverNames=new String[3];
		serverNames[0]="Apache";
		serverNames[1]="MangoDB";
		serverNames[2]="SMTP";
		
		ServerType type1=new ServerType("Web Server");
		ServerType type2=new ServerType("database server");
		ServerType type3=new ServerType("Mail server");
		
		ServerType[] type=new ServerType[3];
		type[0]=type1;
		type[1]=type2;
		type[2]=type3;
		
		Server server=new Server(serverNames,type);
		server.printInfo();
		
		int[] evolutions=new int[3];
		evolutions[0]=1980;
		evolutions[1]=2000;
		evolutions[2]=2010;
		
		Character character1=new Character("Nicholson",36);
		Character character2=new Character("Ledger",44);
		Character character3=new Character("Phoenix/Leto",39);
		
		Character[] character=new Character[3];
		character[0]=character1;
		character[1]=character2;
		character[2]=character3;
		
		Joker joker=new Joker(evolutions,character);
		joker.printInfo();
		
		String[] types=new String[3];
		types[0]="flatbed";
		types[1]="sheet-fed";
		types[2]="portable";
		
		ScannerName name1=new ScannerName("Epson",5999);
		ScannerName name2=new ScannerName("HP Scanjet Pro",26519);
		ScannerName name3=new ScannerName("KODAK",32411);
		
		ScannerName[] names=new ScannerName[3];
		names[0]=name1;
		names[1]=name2;
		names[2]=name3;
		
		Scanner scanner=new Scanner(types,names);
		scanner.printInfo();

       
        String[] companies = new String[3];
        companies[0] = "No Broker";
        companies[1] = "Shadi.com";
        companies[2] = "Aswasurya";
		
        BrokerType brokerType1 = new BrokerType("Home Broker", 15);
        BrokerType brokerType2 = new BrokerType("Marriage Broker", 10);
        BrokerType brokerType3 = new BrokerType("Real Estate Broker", 7);

        BrokerType[] brokertypes = new BrokerType[3];
        brokertypes[0] = brokerType1;
        brokertypes[1] = brokerType2;
        brokertypes[2] = brokerType3;

        Broker broker = new Broker(companies, brokertypes);
        broker.printInfo();
		
		int[] prices=new int[3];
		prices[0]=346;
		prices[1]=437;
		prices[2]=590;
		
		HammerBrand hammerBrand1=new HammerBrand("Taparia",346);
		HammerBrand hammerBrand2=new HammerBrand("Stanley",437);
		HammerBrand hammerBrand3=new HammerBrand("Groz",590);
		
		HammerBrand[] hammerBrands=new HammerBrand[3];
		hammerBrands[0]=hammerBrand1;
		hammerBrands[1]=hammerBrand2;
		hammerBrands[2]=hammerBrand3;
		
		Hammer hammer=new Hammer(prices,hammerBrands);
		hammer.printInfo();
		
		String[] halwaIngredients=new String[3];
		halwaIngredients[0]="Carrot";
		halwaIngredients[1]="Milk";
		halwaIngredients[2]="Sugar";

		CarrotHalwaBrand halwaBrand1=new CarrotHalwaBrand("A2B",250);
		CarrotHalwaBrand halwaBrand2=new CarrotHalwaBrand("MTR",300);
		CarrotHalwaBrand halwaBrand3=new CarrotHalwaBrand("Nandini",200);

		CarrotHalwaBrand[] halwaBrands=new CarrotHalwaBrand[3];
		halwaBrands[0]=halwaBrand1;
		halwaBrands[1]=halwaBrand2;
		halwaBrands[2]=halwaBrand3;

		CarrotHalwa carrotHalwa=new CarrotHalwa(halwaIngredients,halwaBrands);
		carrotHalwa.printInfo();
		
		int[] sweetPrices=new int[3];
		sweetPrices[0]=120;
		sweetPrices[1]=150;
		sweetPrices[2]=180;

		JamoonBrand sweetBrand1=new JamoonBrand("Haldiram",120);
		JamoonBrand sweetBrand2=new JamoonBrand("A2B",150);
		JamoonBrand sweetBrand3=new JamoonBrand("MTR",180);

		JamoonBrand[] sweetBrands=new JamoonBrand[3];
		sweetBrands[0]=sweetBrand1;
		sweetBrands[1]=sweetBrand2;
		sweetBrands[2]=sweetBrand3;

		Jamoon jamoonSweet=new Jamoon(sweetPrices,sweetBrands);
		jamoonSweet.printInfo();
		
		String[] bannerMaterials=new String[3];
		bannerMaterials[0]="Flex";
		bannerMaterials[1]="Vinyl";
		bannerMaterials[2]="Cloth";

		BannerType bannerType1=new BannerType("Birthday Banner",200);
		BannerType bannerType2=new BannerType("Wedding Banner",350);
		BannerType bannerType3=new BannerType("Advertisement Banner",500);

		BannerType[] bannerTypes=new BannerType[3];
		bannerTypes[0]=bannerType1;
		bannerTypes[1]=bannerType2;
		bannerTypes[2]=bannerType3;

		Banner bannerDisplay=new Banner(bannerMaterials,bannerTypes);
		bannerDisplay.printInfo();
		
		String[] towerLocations=new String[3];
		towerLocations[0]="Dubai";
		towerLocations[1]="Paris";
		towerLocations[2]="Tokyo";

		TowerType towerType1=new TowerType("Burj Khalifa",828);
		TowerType towerType2=new TowerType("Eiffel Tower",330);
		TowerType towerType3=new TowerType("Tokyo Tower",333);

		TowerType[] towerTypes=new TowerType[3];
		towerTypes[0]=towerType1;
		towerTypes[1]=towerType2;
		towerTypes[2]=towerType3;

		Tower towerStructure=new Tower(towerLocations,towerTypes);
		towerStructure.printInfo();
				
    }
}