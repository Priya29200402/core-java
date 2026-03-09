class Task8Runner{
	public static void main(String[] args){
		
		Members members1=new Members(550);
		District district1= District.BELAGAVI;
		Parliament parliament1=new Parliament("Karnataka",district1,members1);
		parliament1.printInfo();
		 
		System.out.println("\n");
		Members members2=new Members(224);
		District district2= District.PALNADU;
		Parliament parliament2=new Parliament("AndraPradesh",district2,members2);
		parliament2.printInfo();
		
		System.out.println("\n");
		Members members3=new Members(222);
		District district3= District.KOLHAPUR;
		Parliament parliament3=new Parliament("Maharastra",district3,members3);
		parliament3.printInfo();
		
		System.out.println("\n");
		Members members4=new Members(238);
		District district4= District.KASARGODU;
		Parliament parliament4=new Parliament("Kerala",district4,members4);
		parliament4.printInfo();
		
		System.out.println("\n =======Printing Court Details=======");
		CourtType courtType1=CourtType.CRIMINAL;
		CourtCases courtCases1=new CourtCases(700);
		Court court1=new Court("Karnataka",courtType1,courtCases1);
		court1.printInfo();
		
		System.out.println("\n");
		CourtType courtType2=CourtType.CIVIL;
		CourtCases courtCases2=new CourtCases(1500);
		Court court2=new Court("Andra Pradesh",courtType2,courtCases2);
		court2.printInfo();
		
		
		System.out.println("\n");
		CourtType courtType3=CourtType.FAMILY;
		CourtCases courtCases3=new CourtCases(1800);
		Court court3=new Court("Maharastra",courtType3,courtCases3);
		court3.printInfo();
		
		System.out.println("\n");
		CourtType courtType4=CourtType.CONSUMER;
		CourtCases courtCases4=new CourtCases(260);
		Court court4=new Court("Kerala",courtType4,courtCases4);
		court4.printInfo();
		
		System.out.println("\n =======Printing Dmart Details=======");
		ItemName itemName1=ItemName.RICE;
		ItemQuantity itemQuantity1=new ItemQuantity(10);
		Dmart dmart1=new Dmart("BTM Layout",itemName1,itemQuantity1);
		dmart1.printInfo();
		
		System.out.println("\n");
		ItemName itemName2=ItemName.MOONGDAL;
		ItemQuantity itemQuantity2=new ItemQuantity(2);
		Dmart dmart2=new Dmart("Rajaji Nagar",itemName2,itemQuantity2);
		dmart2.printInfo();
		
		System.out.println("\n");
		ItemName itemName3=ItemName.KITKAT;
		ItemQuantity itemQuantity3=new ItemQuantity(20);
		Dmart dmart3=new Dmart("Electronic City ",itemName3,itemQuantity3);
		dmart3.printInfo();
		
		System.out.println("\n");
		ItemName itemName4=ItemName.SPRITE;
		ItemQuantity itemQuantity4=new ItemQuantity(5);
		Dmart dmart4=new Dmart("Electronic City ",itemName4,itemQuantity4);
		dmart4.printInfo();
		
		System.out.println("\n =======Printing Fort Details=======");
		KingName king1=KingName.SHIVAJI;
		Height height1=new Height(2600);
		Fort fort1=new Fort("Rajhansgad",king1,height1);
		fort1.printInfo();
		
		System.out.println("\n");
		KingName king2=KingName.KEMPEGOUDA;
		Height height2=new Height(1600);
		Fort fort2=new Fort("Bengaluru Fort",king2,height2);
		fort2.printInfo();
		
		System.out.println("\n");
		KingName king3=KingName.ADILSHAHI;
		Height height3=new Height(1800);
		Fort fort3=new Fort(" Bijapur Fort",king3,height3);
		fort3.printInfo();
		
		System.out.println("\n");
		KingName king4=KingName.MALLABYREGOWDA;
		Height height4=new Height(800);
		Fort fort4=new Fort(" Devanahalli Fort",king4,height4);
		fort4.printInfo();
		
		System.out.println("\n =======Printing Napkin Details=======");
		NapkinSize size1=NapkinSize.S;
		Material material1=new Material("Cotton");
		Napkin napkin1=new Napkin(size1,material1,"Brown");
		napkin1.printInfo();
		
		System.out.println("\n");
		NapkinSize size2=NapkinSize.M;
		Material material2=new Material("MicroFiber");
		Napkin napkin2=new Napkin(size2,material2,"White");
		napkin2.printInfo();
		
		System.out.println("\n");
		NapkinSize size3=NapkinSize.XL;
		Material material3=new Material("Polyster");
		Napkin napkin3=new Napkin(size3,material3,"Black");
		napkin3.printInfo();
		
		System.out.println("\n");
		NapkinSize size4=NapkinSize.XXL;
		Material material4=new Material("Crepe");
		Napkin napkin4=new Napkin(size4,material4,"Black");
		napkin4.printInfo();
		
		System.out.println("\n =======Printing Pumpkin Details=======");
		Variety type1=Variety.CONNECTICUT;
		PumpkinQuality quality1=new PumpkinQuality(true);
		Pumpkin pumpkin1=new Pumpkin(type1,189,quality1);
		pumpkin1.printInfo();
		
		System.out.println("\n");
		Variety type2=Variety.HOWDEN;
		PumpkinQuality quality2=new PumpkinQuality(false);
		Pumpkin pumpkin2=new Pumpkin(type2,169,quality2);
		pumpkin2.printInfo();
		
		System.out.println("\n");
		Variety type3=Variety.RACER;
		PumpkinQuality quality3=new PumpkinQuality(true);
		Pumpkin pumpkin3=new Pumpkin(type3,170,quality3);
		pumpkin3.printInfo();
		
		
		System.out.println("\n");
		Variety type4=Variety.WOLF;
		PumpkinQuality quality4=new PumpkinQuality(true);
		Pumpkin pumpkin4=new Pumpkin(type4,270,quality4);
		pumpkin4.printInfo();
		
		System.out.println("\n =======Printing Calendar Details=======");
		CalendarCompany company1=CalendarCompany.MAHALAXMI;
		LeapYear leapYear1=new LeapYear(false);
		Calendar calendar1=new Calendar(company1,leapYear1,60);
		calendar1.printInfo();
		
		System.out.println("\n");
		CalendarCompany company2=CalendarCompany.INDIAMART;
		LeapYear leapYear2=new LeapYear(true);
		Calendar calendar2=new Calendar(company2,leapYear2,160);
		calendar2.printInfo();
		
		System.out.println("\n");
		CalendarCompany company3=CalendarCompany.REDPIXEL;
		LeapYear leapYear3=new LeapYear(true);
		Calendar calendar3=new Calendar(company3,leapYear3,180);
		calendar3.printInfo();
		
		System.out.println("\n");
		CalendarCompany company4=CalendarCompany.ZOHO;
		LeapYear leapYear4=new LeapYear(false);
		Calendar calendar4=new Calendar(company4,leapYear4,180);
		calendar4.printInfo();
		
		System.out.println("\n =======Printing Horlicks Details=======");

		HorlicksCompany hCompany1 = HorlicksCompany.HINDUSTAN;
		Flavor flavor1 = new Flavor("Chocolate");
		Horlicks horlicks1 = new Horlicks(hCompany1, flavor1, 250);
		horlicks1.printInfo();

		System.out.println("\n");
		HorlicksCompany hCompany2 = HorlicksCompany.NESTLE;
		Flavor flavor2 = new Flavor("Vanilla");
		Horlicks horlicks2 = new Horlicks(hCompany2, flavor2, 260);
		horlicks2.printInfo();

		System.out.println("\n");
		HorlicksCompany hCompany3 = HorlicksCompany.BRITANNIA;
		Flavor flavor3 = new Flavor("Strawberry");
		Horlicks horlicks3 = new Horlicks(hCompany3, flavor3, 270);
		horlicks3.printInfo();

		System.out.println("\n");
		HorlicksCompany hCompany4 = HorlicksCompany.AMUL;
		Flavor flavor4 = new Flavor("Malt");
		Horlicks horlicks4 = new Horlicks(hCompany4, flavor4, 280);
		horlicks4.printInfo();
		
		System.out.println("\n =======Printing Wallnut Details=======");

		WallnutType wType1 = WallnutType.ORGANIC;
		Supplier supplier1 = new Supplier("DryFruit Supplier");
		Wallnut wallnut1 = new Wallnut(wType1, supplier1, 500);
		wallnut1.printInfo();

		System.out.println("\n");
		WallnutType wType2 = WallnutType.PREMIUM;
		Supplier supplier2 = new Supplier("Fresh Mart");
		Wallnut wallnut2 = new Wallnut(wType2, supplier2, 550);
		wallnut2.printInfo();

		System.out.println("\n");
		WallnutType wType3 = WallnutType.NATURAL;
		Supplier supplier3 = new Supplier("Organic Farm");
		Wallnut wallnut3 = new Wallnut(wType3, supplier3, 600);
		wallnut3.printInfo();

		System.out.println("\n");
		WallnutType wType4 = WallnutType.IMPORTED;
		Supplier supplier4 = new Supplier("Nut Store");
		Wallnut wallnut4 = new Wallnut(wType4, supplier4, 650);
		wallnut4.printInfo();
		
		System.out.println("\n =======Printing Cashew Details=======");

		CashewType cType1 = CashewType.W180;
		Farm farm1 = new Farm("Goa");
		Cashew cashew1 = new Cashew(cType1, farm1, 700);
		cashew1.printInfo();

		System.out.println("\n");
		CashewType cType2 = CashewType.W240;
		Farm farm2 = new Farm("Kerala");
		Cashew cashew2 = new Cashew(cType2, farm2, 750);
		cashew2.printInfo();

		System.out.println("\n");
		CashewType cType3 = CashewType.W320;
		Farm farm3 = new Farm("Mangalore");
		Cashew cashew3 = new Cashew(cType3, farm3, 800);
		cashew3.printInfo();

		System.out.println("\n");
		CashewType cType4 = CashewType.W400;
		Farm farm4 = new Farm("Udupi");
		Cashew cashew4 = new Cashew(cType4, farm4, 850);
		cashew4.printInfo();
		
		System.out.println("\n =======Printing Paneer Details=======");

		PaneerBrand brand1 = PaneerBrand.AMUL;
		Dairy dairy1 = new Dairy("Amul Dairy");
		Paneer paneer1 = new Paneer(brand1, dairy1, 200);
		paneer1.printInfo();

		System.out.println("\n");
		PaneerBrand brand2 = PaneerBrand.NANDINI;
		Dairy dairy2 = new Dairy("Nandini Dairy");
		Paneer paneer2 = new Paneer(brand2, dairy2, 220);
		paneer2.printInfo();

		System.out.println("\n");
		PaneerBrand brand3 = PaneerBrand.MILKY_MIST;
		Dairy dairy3 = new Dairy("Milky Mist Dairy");
		Paneer paneer3 = new Paneer(brand3, dairy3, 240);
		paneer3.printInfo();

		System.out.println("\n");
		PaneerBrand brand4 = PaneerBrand.HERITAGE;
		Dairy dairy4 = new Dairy("Heritage Dairy");
		Paneer paneer4 = new Paneer(brand4, dairy4, 260);
		paneer4.printInfo();
		
		System.out.println("\n =======Printing Mushroom Details=======");

		MushroomType mType1 = MushroomType.BUTTON;
		FarmHouse farmHouse1 = new FarmHouse("Bangalore");
		Mushroom mushroom1 = new Mushroom(mType1, farmHouse1, 120);
		mushroom1.printInfo();

		System.out.println("\n");
		MushroomType mType2 = MushroomType.OYSTER;
		FarmHouse farmHouse2 = new FarmHouse("Mysore");
		Mushroom mushroom2 = new Mushroom(mType2, farmHouse2, 130);
		mushroom2.printInfo();

		System.out.println("\n");
		MushroomType mType3 = MushroomType.SHIITAKE;
		FarmHouse farmHouse3 = new FarmHouse("Coorg");
		Mushroom mushroom3 = new Mushroom(mType3, farmHouse3, 140);
		mushroom3.printInfo();

		System.out.println("\n");
		MushroomType mType4 = MushroomType.PORTOBELLO;
		FarmHouse farmHouse4 = new FarmHouse("Chikmagalur");
		Mushroom mushroom4 = new Mushroom(mType4, farmHouse4, 150);
		mushroom4.printInfo();
		
		System.out.println("\n =======Printing Beer Details=======");

		BeerBrand bBrand1 = BeerBrand.KINGFISHER;
		Brewery brewery1 = new Brewery("United Breweries");
		Beer beer1 = new Beer(bBrand1, brewery1, 180);
		beer1.printInfo();

		System.out.println("\n");
		BeerBrand bBrand2 = BeerBrand.BUDWEISER;
		Brewery brewery2 = new Brewery("Bud Brewery");
		Beer beer2 = new Beer(bBrand2, brewery2, 200);
		beer2.printInfo();

		System.out.println("\n");
		BeerBrand bBrand3 = BeerBrand.HEINEKEN;
		Brewery brewery3 = new Brewery("Heineken Brewery");
		Beer beer3 = new Beer(bBrand3, brewery3, 220);
		beer3.printInfo();

		System.out.println("\n");
		BeerBrand bBrand4 = BeerBrand.CARLSBERG;
		Brewery brewery4 = new Brewery("Carlsberg Brewery");
		Beer beer4 = new Beer(bBrand4, brewery4, 240);
		beer4.printInfo();	

	}
}