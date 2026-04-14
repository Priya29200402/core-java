class Task1Runner{
	public static void main(String[] args){
		
		System.out.println("----MusicalIntruments Deatils----");
		System.out.println("\n------Using All Arguments in Constructor-----");
		Artist artist1=new Artist("guitar",15000,"Shrusti");
		System.out.println("Name:"+artist1.name);
		System.out.println("Price:"+artist1.price);
		System.out.println("Artist:"+artist1.artist);
		
		System.out.println("\n------Using No Arguments in Constructor-----");
		Artist artist2=new Artist();
		System.out.println("Name:"+artist2.name);
		System.out.println("Price:"+artist2.price);
		System.out.println("Artist:"+artist2.artist);
		
		System.out.println("\n------Using 1 Arguments in Constructor-----");
		Artist artist3=new Artist("Drum");
		System.out.println("Name:"+artist3.name);
		System.out.println("Price:"+artist3.price);
		System.out.println("Artist:"+artist3.artist);
		
		System.out.println("\n----Stage Deatils----");
		
		System.out.println("\n------Stage Using All Arguments in Constructor-----");
        StageDetails stage1=new StageDetails("OpenStage",200,"Chennai");
        System.out.println("Name:"+ stage1.name);
        System.out.println("Capacity:"+ stage1.capacity);
        System.out.println("Location:"+ stage1.location);

        System.out.println("\n------Stage Using No Arguments in Constructor-----");
        StageDetails stage2=new StageDetails();
        System.out.println("Name:"+ stage2.name);
        System.out.println("Capacity:"+ stage2.capacity);
        System.out.println("Location:"+ stage2.location);

        System.out.println("\n------Stage Using 1 Argument in Constructor-----");
        StageDetails stage3=new StageDetails("MiniStage");
        System.out.println("Name:"+ stage3.name);
        System.out.println("Capacity:"+ stage3.capacity);
        System.out.println("Location:"+ stage3.location);
		
		System.out.println("\n----StairCase Deatils----");
		
		System.out.println("\n------StairCase Using All Arguments in Constructor-----");
        StairCaseDetails stair1=new StairCaseDetails(25,"Wood","Spiral");
        System.out.println("Steps:"+ stair1.steps);
        System.out.println("Material:"+ stair1.material);
        System.out.println("Type:"+ stair1.type);

        System.out.println("\n------StairCase Using No Arguments in Constructor-----");
        StairCaseDetails stair2=new StairCaseDetails();
        System.out.println("Steps:"+ stair2.steps);
        System.out.println("Material:"+ stair2.material);
        System.out.println("Type:"+ stair2.type);

        System.out.println("\n------StairCase Using 1 Argument in Constructor-----");
        StairCaseDetails stair3=new StairCaseDetails(15);
        System.out.println("Steps:"+ stair3.steps);
        System.out.println("Material:"+ stair3.material);
        System.out.println("Type:"+ stair3.type);
		
		System.out.println("\n----Reel Deatils----");
		
		System.out.println("\n------Reel Using All Arguments in Constructor-----");
        SocialMedia reel1=new SocialMedia("Instagram",30,"Triveni");
        System.out.println("Platform:"+ reel1.platform);
        System.out.println("Duration:"+ reel1.duration);
        System.out.println("Creator:"+ reel1.creator);

        System.out.println("\n------Reel Using No Arguments in Constructor-----");
        SocialMedia reel2=new SocialMedia();
        System.out.println("Platform:"+ reel2.platform);
        System.out.println("Duration:"+ reel2.duration);
        System.out.println("Creator:"+ reel2.creator);

        System.out.println("\n------Reel Using 1 Argument in Constructor-----");
        SocialMedia reel3=new SocialMedia("YouTube");
        System.out.println("Platform:"+ reel3.platform);
        System.out.println("Duration:"+ reel3.duration);
        System.out.println("Creator:"+ reel3.creator);
		
		System.out.println("\n----Building Deatils----");
		
		System.out.println("\n------Building Using All Arguments in Constructor-----");
        Apartment building1=new Apartment("SkyTower",10,"Delhi");
        System.out.println("Name:"+ building1.name);
        System.out.println("Floors:"+ building1.floors);
        System.out.println("City:"+ building1.city);

        System.out.println("\n------Building Using No Arguments in Constructor-----");
        Apartment building2=new Apartment();
        System.out.println("Name:"+ building2.name);
        System.out.println("Floors:"+ building2.floors);
        System.out.println("City:"+ building2.city);

        System.out.println("\n------Building Using 1 Argument in Constructor-----");
        Apartment building3=new Apartment("GreenHeights");
        System.out.println("Name:"+ building3.name);
        System.out.println("Floors:"+ building3.floors);
        System.out.println("City:"+ building3.city);
		
		System.out.println("\n----Chicken Deatils----");
		
		System.out.println("\n------Chicken Using All Arguments in Constructor-----");
        ChickenShop chicken1=new ChickenShop("Broiler",2.5,"White");
        System.out.println("Type:"+ chicken1.type);
        System.out.println("Weight:"+ chicken1.weight);
        System.out.println("Color:"+ chicken1.color);

        System.out.println("\n------Chicken Using No Arguments in Constructor-----");
        ChickenShop chicken2=new ChickenShop();
        System.out.println("Type:"+ chicken2.type);
        System.out.println("Weight:"+ chicken2.weight);
        System.out.println("Color:"+ chicken2.color);

        System.out.println("\n------Chicken Using 1 Argument in Constructor-----");
        ChickenShop chicken3 = new ChickenShop("Desi");
        System.out.println("Type:" + chicken3.type);
        System.out.println("Weight:" + chicken3.weight);
        System.out.println("Color:" + chicken3.color);
		
		System.out.println("\n----Butter Deatils----");
		
		System.out.println("\n------Butter Using All Arguments in Constructor-----");
        ButterDetails butter1=new ButterDetails("Amul",50,false);
        System.out.println("Brand:"+ butter1.brand);
        System.out.println("Price:"+ butter1.price);
        System.out.println("Flavor:"+ butter1.expired);

        System.out.println("\n------Butter Using No Arguments in Constructor-----");
        ButterDetails butter2=new ButterDetails();
        System.out.println("Brand:"+ butter2.brand);
        System.out.println("Price:"+ butter2.price);
        System.out.println("Flavor:"+ butter2.expired);

        System.out.println("\n------Butter Using 1 Argument in Constructor-----");
        ButterDetails butter3=new ButterDetails("Nandini");
        System.out.println("Brand:"+ butter3.brand);
        System.out.println("Price:"+ butter3.price);
        System.out.println("Flavor:"+ butter3.expired);
		
		System.out.println("\n----Shawarma Deatils----");
		
		System.out.println("\n------Shawarma Using All Arguments in Constructor-----");
        KFCShawarma Shawarma1=new KFCShawarma("Chicken","Large",120);
        System.out.println("Type:"+ Shawarma1.type);
        System.out.println("Size:"+ Shawarma1.size);
        System.out.println("Price:"+ Shawarma1.price);

        System.out.println("\n------Shawarma Using No Arguments in Constructor-----");
        KFCShawarma Shawarma2=new KFCShawarma();
        System.out.println("Type:"+ Shawarma2.type);
        System.out.println("Size:"+ Shawarma2.size);
        System.out.println("Price:"+ Shawarma2.price);

        System.out.println("\n------Shawarma Using 1 Argument in Constructor-----");
        KFCShawarma Shawarma3=new KFCShawarma("Veg");
        System.out.println("Type:"+ Shawarma3.type);
        System.out.println("Size:"+ Shawarma3.size);
        System.out.println("Price:"+ Shawarma3.price);
		
		System.out.println("\n----BlueWhale Deatils----");
		
		System.out.println("\n------BlueWhale Using All Arguments in Constructor-----");
        Ocean bluWhale1=new Ocean(25.0,150000,"Pacific");
        System.out.println("Length:"+ bluWhale1.length);
        System.out.println("Weight:"+ bluWhale1.weight);
        System.out.println("Ocean:"+ bluWhale1.ocean);

        System.out.println("\n------BlueWhale Using No Arguments in Constructor-----");
        Ocean bluWhale2=new Ocean();
        System.out.println("Length:"+ bluWhale2.length);
        System.out.println("Weight:"+ bluWhale2.weight);
        System.out.println("Ocean:"+ bluWhale2.ocean);

        System.out.println("\n------BlueWhale Using 1 Argument in Constructor-----");
        Ocean bluWhale3 = new Ocean(30.0);
        System.out.println("Length:"+ bluWhale3.length);
        System.out.println("Weight:"+ bluWhale3.weight);
        System.out.println("Ocean:"+ bluWhale3.ocean);
		
		System.out.println("\n----GermanShepherd Deatils----");
		
		System.out.println("\n------GermanShepherd Using All Arguments in Constructor-----");
        GermanShepherdDetails dog1=new GermanShepherdDetails("Rocky", 5, "Brown");
        System.out.println("Name:"+ dog1.name);
        System.out.println("Age:"+ dog1.age);
        System.out.println("Color:"+ dog1.color);

        System.out.println("\n------GermanShepherd Using No Arguments in Constructor-----");
        GermanShepherdDetails dog2=new GermanShepherdDetails();
        System.out.println("Name:"+ dog2.name);
        System.out.println("Age:"+ dog2.age);
        System.out.println("Color:"+ dog2.color);

        System.out.println("\n------GermanShepherd Using 1 Argument in Constructor-----");
        GermanShepherdDetails dog3=new GermanShepherdDetails("Bruno");
        System.out.println("Name:"+ dog3.name);
        System.out.println("Age:"+ dog3.age);
        System.out.println("Color:"+ dog3.color);
		
		
		
	
		
		
	}
}