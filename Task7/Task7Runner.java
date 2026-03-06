class Task7Runner{

    public static void main(String[] args) {

        MouseCompany mousecompany = new MouseCompany("Zebronics");
        Scroller scroller = new Scroller("Scroller is Working");
        Connection connection = new Connection("Bluetooth");
        Applicable applicable = new Applicable("Applicable for all Laptops");
        MouseColor mousecolor = new MouseColor("White");

        Mouse mouse = new Mouse("Razer", 399, true, false, 5,
                                mousecompany, scroller, connection, applicable, mousecolor);

        mouse.getMouseDetails();

		
		System.out.println("\n ========================");
		
		FileType fileType=new FileType("Document");
		FileOwner fileOwner=new FileOwner("Priya");
		FileLocation fileLocation=new FileLocation("C Drive");
		FilePermission filePermission=new FilePermission("Read Write");
		FileFormat fileFormat=new FileFormat("PDF");

		File file=new File("Assignment",2.5,10,true,true,
		                   fileType,fileOwner,fileLocation,filePermission,fileFormat);
	    
		System.out.println("\n ========================");		
	    LionType lionType=new LionType("Asiatic");
		LionColor lionColor=new LionColor("Golden");
		LionHabitat lionHabitat=new LionHabitat("Forest");
		LionFood lionFood=new LionFood("Meat");
		LionOrigin lionOrigin=new LionOrigin("India");

		Lion lion=new Lion("Simba",5,190.5,true,true,
		                   lionType,lionColor,lionHabitat,lionFood,lionOrigin);
						   
		System.out.println("\n ========================");	
		
		MotorCompany motorCompany = new MotorCompany("Bosch");
        MotorType motorType = new MotorType("AC Motor");
        MotorColor motorColor = new MotorColor("Black");
        MotorSpeed motorSpeed = new MotorSpeed("3000 RPM");
        MotorUsage motorUsage = new MotorUsage("Industrial Use");

        Motor motor = new Motor("Siemens",1500,25000.50,true,2,
                motorCompany,motorType,motorColor,motorSpeed,motorUsage);

        motor.getMotorDetails();
		
		System.out.println("===== IPL Details =====");
        IplOwner owner = new IplOwner("Qatar");
        IplCoach iplCoach = new IplCoach("Dinesh Karthik");
        IplCaptain captain = new IplCaptain("Rajat Patidar");
        IplHomeGround ground = new IplHomeGround("Chinnaswami Stadium Bengaluru");
        IplSponsor sponsor = new IplSponsor("Nothing");

        Ipl ipl = new Ipl("Royal Challengers Bengaluru",5,8500,true,25,
                owner,iplCoach,captain,ground,sponsor);
        ipl.getIplDetails();
		
		System.out.println("\n===== Spa Details =====");
        SpaOwner spaOwner = new SpaOwner("Anita");
        SpaLocation spaLocation = new SpaLocation("Bangalore");
        SpaType spaType = new SpaType("Luxury");
        SpaService spaService = new SpaService("Full Body Massage");
        SpaRating spaRating = new SpaRating("5 Star");

        Spa spa = new Spa("Relax Spa",10,2000,true,15,
                spaOwner,spaLocation,spaType,spaService,spaRating);
        spa.getSpaDetails();
		
		
        System.out.println("\n===== Tea Details =====");
        TeaType teaType = new TeaType("Green Tea");
        TeaOrigin teaOrigin = new TeaOrigin("Assam");
        TeaColor teaColor = new TeaColor("Green");
        TeaFlavor teaFlavor = new TeaFlavor("Mint");
        TeaCompany teaCompany = new TeaCompany("Tata Tea");

        Tea tea = new Tea("Tata",2,120,true,5,
                teaType,teaOrigin,teaColor,teaFlavor,teaCompany);
        tea.getTeaDetails();
		
		System.out.println("===== Bell Details =====");
        BellMaterial bellMaterial = new BellMaterial("Brass");
        BellColor bellColor = new BellColor("Golden");
        BellBrand bellBrand = new BellBrand("TempleBrand");
        BellUsage bellUsage = new BellUsage("Temple");
        BellSound bellSound = new BellSound("Loud");

        Bell bell = new Bell("TempleBell",5,2.5,true,3,
                bellMaterial,bellColor,bellBrand,bellUsage,bellSound);
        bell.getBellDetails();
		
		System.out.println("\n===== Cloud Storage Details =====");

		CloudProvider provider = new CloudProvider("AWS");
		CloudRegion region = new CloudRegion("Asia-Pacific");
		CloudType type = new CloudType("Public Cloud");
		CloudPlan plan = new CloudPlan("Premium");
		CloudBackup backup = new CloudBackup("Automatic Backup");

		Cloud cloud = new Cloud("Amazon S3",1000,9.99,true,500,
				provider,region,type,plan,backup);

		cloud.getCloudDetails();

		System.out.println("\n===== Aquarium Details =====");
        AquariumType aquariumType = new AquariumType("Glass");
        AquariumMaterial aquariumMaterial = new AquariumMaterial("Glass");
        AquariumColor aquariumColor = new AquariumColor("Transparent");
        AquariumBrand aquariumBrand = new AquariumBrand("AquaWorld");
        AquariumLight aquariumLight = new AquariumLight("LED");

        Aquarium aquarium = new Aquarium("HomeTank",10,3500,true,20,
                aquariumType,aquariumMaterial,aquariumColor,aquariumBrand,aquariumLight);
        aquarium.getAquariumDetails();		
		
    }
}