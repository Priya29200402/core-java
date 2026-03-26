class ProductRunner{
    public static void main(String[] args){

        Product[] products=new Product[137];
        ProductStore productstore=new ProductStore(products);

        Product product1=new Product("Laptop","Intel","01-04-2025",56000, ProductTypes.ELECTRONICS,
		                               "Ashok",WarrantyYears.ONE_YEAR,false,"HP_121","India");
									   
		Product product2=new Product("TV","LG","23-11-2025",30000, ProductTypes.ELECTRONICS,
		                               "Raj",WarrantyYears.THREE_YEARS,false,"LG_122","India");	
									   
		Product product3=new Product("Maaza","Juice","13-03-2026",20, ProductTypes.FOOD,
		                               "",WarrantyYears.ONE_YEAR,false,"Maaza_131","China");
		
		Product product4=new Product("Dairy Milk","Cadberry","14-02-2026",80, ProductTypes.FOOD,
		                               "Raj",WarrantyYears.ONE_YEAR,false,"Cad_120","America");
		
		Product product5=new Product("BED","gamma","27-12-2023",8000, ProductTypes.FURNITURE,
		                               "Raj",WarrantyYears.THREE_YEARS,false,"G_125","German");
		
		Product product6=new Product("Cold Tablet","Cheston Cold","15-07-2025",15, ProductTypes.MEDICAL,
		                               "Appolo",WarrantyYears.ONE_YEAR,true,"C_126","India");
		
        Product product7=new Product("BED","gamma","27-12-2023",8000, ProductTypes.FURNITURE,
		                               "Gamma",WarrantyYears.THREE_YEARS,false,"G_125","German");		
									   
		Product product8=new Product("Iron Box","Philips","24-1-2023",800, ProductTypes.ELECTRONICS,
		                               "Philips Company",WarrantyYears.ONE_YEAR,false,"I_126","Japan");
									   
		Product product9=new Product("BedSheet","sleepWell","26-10-2024",350, ProductTypes.CLOTHING,
		                               "SleepWell",WarrantyYears.ONE_YEAR,false,"BS_127","India");							   
									   
		Product product10=new Product("Cupboard","Sky","2-02-2023",20000, ProductTypes.FURNITURE,
		                               "Sky Company",WarrantyYears.ONE_YEAR,false,"C_128","India");							   
									   
		Product product11=new Product("Bottle","Milton","8-1-2023",500, ProductTypes.ELECTRONICS,
		                               "Milton Company",WarrantyYears.ONE_YEAR,false,"M_129","Russia");	
        
        Product product12=new Product("SmartWatch","Noise","05-05-2025",2500, ProductTypes.ELECTRONICS,
                                       "Ramesh",WarrantyYears.ONE_YEAR,false,"S_130","India");

		Product product13=new Product("Refrigerator","Samsung","11-06-2025",45000, ProductTypes.ELECTRONICS,
									   "Suresh",WarrantyYears.TEN_YEARS,false,"R_131","Korea");

		Product product14=new Product("Sofa","Ikea","19-07-2024",22000, ProductTypes.FURNITURE,
									   "Anita",WarrantyYears.THREE_YEARS,false,"S_132","Sweden");

		Product product15=new Product("T-Shirt","Zara","08-08-2025",1200, ProductTypes.CLOTHING,
									   "Anush",WarrantyYears.ONE_YEAR,false,"T_133","Spain");

		Product product16=new Product("Jeans","Levis","14-09-2025",3000, ProductTypes.CLOTHING,
									   "Arjun",WarrantyYears.ONE_YEAR,false,"J_134","USA");

		Product product17=new Product("Dining Table","HomeCenter","21-10-2024",15000, ProductTypes.FURNITURE,
									   "Meena",WarrantyYears.THREE_YEARS,false,"D_135","UAE");

		Product product18=new Product("Microwave","Panasonic","30-11-2025",8000, ProductTypes.ELECTRONICS,
									   "Kiran",WarrantyYears.ONE_YEAR,false,"M_136","Japan");

		Product product19=new Product("Washing Machine","Bosch","02-12-2025",35000, ProductTypes.ELECTRONICS,
									   "Deepak",WarrantyYears.TEN_YEARS,false,"W_137","Germany");

		Product product20=new Product("Shoes","Nike","17-01-2026",5000, ProductTypes.CLOTHING,
									   "Rahul",WarrantyYears.ONE_YEAR,false,"S_138","USA");

		Product product21=new Product("Jacket","Puma","23-02-2026",4000, ProductTypes.CLOTHING,
									   "Sneha",WarrantyYears.ONE_YEAR,false,"J_139","Germany");

		Product product22=new Product("Tablet","Lenovo","12-03-2025",20000, ProductTypes.ELECTRONICS,
									   "Vikram",WarrantyYears.ONE_YEAR,false,"T_140","China");

		Product product23=new Product("Chair","Nilkamal","28-04-2024",1500, ProductTypes.FURNITURE,
									   "Geeta",WarrantyYears.ONE_YEAR,false,"C_141","India");

		Product product24=new Product("Headphones","Boat","06-05-2025",1800, ProductTypes.ELECTRONICS,
									   "Rohit",WarrantyYears.ONE_YEAR,false,"H_142","India");

		Product product25=new Product("Curtains","DDecor","15-06-2024",2200, ProductTypes.FURNITURE,
									   "Asha",WarrantyYears.ONE_YEAR,false,"C_143","India");

		Product product26=new Product("Pizza","Dominos","19-07-2026",300, ProductTypes.FOOD,
									   "Dominos",WarrantyYears.ONE_YEAR,false,"P_144","India");

		Product product27=new Product("Burger","McDonalds","25-08-2026",150, ProductTypes.FOOD,
									   "McD",WarrantyYears.ONE_YEAR,false,"B_145","USA");

		Product product28=new Product("Pain Relief Gel","Volini","10-09-2025",120, ProductTypes.MEDICAL,
									   "SunPharma",WarrantyYears.ONE_YEAR,true,"P_146","India");

		Product product29=new Product("Vitamin Tablets","Zincovit","18-10-2025",90, ProductTypes.MEDICAL,
									   "Apex Labs",WarrantyYears.ONE_YEAR,true,"V_147","India");

		Product product30=new Product("Water Purifier","Kent","27-11-2025",14000, ProductTypes.ELECTRONICS,
									   "Kent RO",WarrantyYears.THREE_YEARS,false,"W_148","India");

		Product product31=new Product("Air Conditioner","Daikin","03-12-2025",50000, ProductTypes.ELECTRONICS,
									   "Daikin Corp",WarrantyYears.THREE_YEARS,false,"A_149","Japan");	
									   
		Product product32=new Product("Mixer","Preethi","05-01-2025",3500, ProductTypes.ELECTRONICS,
                                        "Lakshmi",WarrantyYears.ONE_YEAR,false,"M_150","India");

		Product product33=new Product("Fan","Usha","12-02-2025",1800, ProductTypes.ELECTRONICS,
									   "Mahesh",WarrantyYears.ONE_YEAR,false,"F_151","India");

		Product product34=new Product("Cupboard","Godrej","18-03-2024",12000, ProductTypes.FURNITURE,
									   "Sanjay",WarrantyYears.THREE_YEARS,false,"C_152","India");

		Product product35=new Product("Blanket","Spaces","25-04-2025",2200, ProductTypes.CLOTHING,
									   "Rekha",WarrantyYears.ONE_YEAR,false,"B_153","India");

		Product product36=new Product("Rice","IndiaGate","02-05-2026",900, ProductTypes.FOOD,
									   "ITC",WarrantyYears.ONE_YEAR,false,"R_154","India");

		Product product37=new Product("Sugar","Madhur","11-06-2026",50, ProductTypes.FOOD,
									   "Madhur Co",WarrantyYears.ONE_YEAR,false,"S_155","India");

		Product product38=new Product("Shampoo","ClinicPlus","20-07-2025",180, ProductTypes.MEDICAL,
									   "HUL",WarrantyYears.ONE_YEAR,true,"S_156","India");

		Product product39=new Product("Toothpaste","Colgate","28-08-2025",120, ProductTypes.MEDICAL,
									   "Colgate Co",WarrantyYears.ONE_YEAR,true,"T_157","USA");

		Product product40=new Product("Keyboard","Logitech","04-09-2025",1500, ProductTypes.ELECTRONICS,
									   "Logitech",WarrantyYears.ONE_YEAR,false,"K_158","Switzerland");

		Product product41=new Product("Mouse","HP","15-10-2025",700, ProductTypes.ELECTRONICS,
									   "HP Corp",WarrantyYears.ONE_YEAR,false,"M_159","USA");

		Product product42=new Product("Notebook","Classmate","23-11-2024",80, ProductTypes.CLOTHING,
									   "ITC",WarrantyYears.ONE_YEAR,false,"N_160","India");

		Product product43=new Product("Pen","Reynolds","02-12-2024",20, ProductTypes.CLOTHING,
									   "Reynolds Co",WarrantyYears.ONE_YEAR,false,"P_161","France");

		Product product44=new Product("Bed","Durian","10-01-2025",25000, ProductTypes.FURNITURE,
									   "Durian Ltd",WarrantyYears.THREE_YEARS,false,"B_162","India");

		Product product45=new Product("Chair","Featherlite","19-02-2025",5500, ProductTypes.FURNITURE,
									   "Featherlite",WarrantyYears.ONE_YEAR,false,"C_163","India");

		Product product46=new Product("Syrup","Benadryl","28-03-2025",140, ProductTypes.MEDICAL,
									   "J&J",WarrantyYears.ONE_YEAR,true,"S_164","USA");

		Product product47=new Product("Ointment","Boroline","05-04-2025",60, ProductTypes.MEDICAL,
									   "Boroline Co",WarrantyYears.ONE_YEAR,true,"O_165","India");

		Product product48=new Product("Watch","Titan","14-05-2025",7000, ProductTypes.ELECTRONICS,
									   "Titan Ltd",WarrantyYears.ONE_YEAR,false,"W_166","India");

		Product product49=new Product("Bag","Skybags","22-06-2025",2500, ProductTypes.CLOTHING,
									   "VIP",WarrantyYears.ONE_YEAR,false,"B_167","India");

		Product product50=new Product("Slippers","Bata","01-07-2025",900, ProductTypes.CLOTHING,
									   "Bata Ltd",WarrantyYears.ONE_YEAR,false,"S_168","Czech");

		Product product51=new Product("Desk","UrbanLadder","11-08-2024",8500, ProductTypes.FURNITURE,
									   "Urban Ladder",WarrantyYears.THREE_YEARS,false,"D_169","India");

		Product product52=new Product("Curtain Rod","GM","19-09-2024",1200, ProductTypes.FURNITURE,
									   "GM Modular",WarrantyYears.ONE_YEAR,false,"C_170","India");

		Product product53=new Product("Juicer","Philips","27-10-2025",4500, ProductTypes.ELECTRONICS,
									   "Philips",WarrantyYears.ONE_YEAR,false,"J_171","Netherlands");

		Product product54=new Product("Speaker","JBL","05-11-2025",6000, ProductTypes.ELECTRONICS,
									   "JBL Corp",WarrantyYears.ONE_YEAR,false,"S_172","USA");

		Product product55=new Product("Chocolate","KitKat","14-12-2026",40, ProductTypes.FOOD,
									   "Nestle",WarrantyYears.ONE_YEAR,false,"C_173","Switzerland");

		Product product56=new Product("IceCream","Amul","22-01-2026",100, ProductTypes.FOOD,
									   "Amul",WarrantyYears.ONE_YEAR,false,"I_174","India");

		Product product57=new Product("Bread","Britannia","02-02-2026",45, ProductTypes.FOOD,
									   "Britannia",WarrantyYears.ONE_YEAR,false,"B_175","India");

		Product product58=new Product("Milk","Nandini","10-03-2026",30, ProductTypes.FOOD,
									   "KMF",WarrantyYears.ONE_YEAR,false,"M_176","India");

		Product product59=new Product("Helmet","Vega","18-04-2025",2000, ProductTypes.CLOTHING,
									   "Vega Auto",WarrantyYears.ONE_YEAR,false,"H_177","India");

		Product product60=new Product("Gloves","Steelbird","26-05-2025",800, ProductTypes.CLOTHING,
									   "Steelbird",WarrantyYears.ONE_YEAR,false,"G_178","India");

		Product product61=new Product("Thermometer","Omron","04-06-2025",500, ProductTypes.MEDICAL,
									   "Omron",WarrantyYears.ONE_YEAR,false,"T_179","Japan");

		Product product62=new Product("BP Monitor","DrMorepen","13-07-2025",1800, ProductTypes.MEDICAL,
									   "Morepen",WarrantyYears.ONE_YEAR,false,"B_180","India");

		Product product63=new Product("Air Cooler","Symphony","21-08-2025",9000, ProductTypes.ELECTRONICS,
									   "Symphony",WarrantyYears.ONE_YEAR,false,"A_181","India");

		Product product64=new Product("Heater","Bajaj","29-09-2025",2500, ProductTypes.ELECTRONICS,
									   "Bajaj",WarrantyYears.ONE_YEAR,false,"H_182","India");

		Product product65=new Product("Wardrobe","Pepperfry","08-10-2024",18000, ProductTypes.FURNITURE,
									   "Pepperfry",WarrantyYears.THREE_YEARS,false,"W_183","India");

		Product product66=new Product("Dresser","Nilkamal","16-11-2024",7000, ProductTypes.FURNITURE,
									   "Nilkamal",WarrantyYears.ONE_YEAR,false,"D_184","India");

		Product product67=new Product("Kurta","FabIndia","24-12-2025",2200, ProductTypes.CLOTHING,
								   "FabIndia",WarrantyYears.ONE_YEAR,false,"K_185","India");

		Product product68=new Product("Saree","Nalli","02-01-2026",5000, ProductTypes.CLOTHING,
									   "Nalli",WarrantyYears.ONE_YEAR,false,"S_186","India");

		Product product69=new Product("Biscuits","GoodDay","11-02-2026",30, ProductTypes.FOOD,
									   "Britannia",WarrantyYears.ONE_YEAR,false,"B_187","India");

		Product product70=new Product("Tea","Tata Tea","20-03-2026",250, ProductTypes.FOOD,
									   "Tata",WarrantyYears.ONE_YEAR,false,"T_188","India");
									   
		Product product71=new Product("Coffee","Bru","01-04-2026",300, ProductTypes.FOOD,
									   "Hindustan Unilever",WarrantyYears.ONE_YEAR,false,"C_189","India");

		Product product72=new Product("Sandwich Maker","Prestige","05-05-2025",2200, ProductTypes.ELECTRONICS,
									   "Prestige Ltd",WarrantyYears.ONE_YEAR,false,"S_190","India");

		Product product73=new Product("Blender","MorphyRichards","12-06-2025",3200, ProductTypes.ELECTRONICS,
									   "Morphy",WarrantyYears.ONE_YEAR,false,"B_191","UK");

		Product product74=new Product("Carpet","Welspun","20-07-2024",4500, ProductTypes.FURNITURE,
									   "Welspun",WarrantyYears.ONE_YEAR,false,"C_192","India");

		Product product75=new Product("Pillow","Kurlon","29-08-2024",900, ProductTypes.FURNITURE,
									   "Kurlon",WarrantyYears.ONE_YEAR,false,"P_193","India");

		Product product76=new Product("Socks","Jockey","10-09-2025",300, ProductTypes.CLOTHING,
									   "Jockey",WarrantyYears.ONE_YEAR,false,"S_194","USA");

		Product product77=new Product("Cap","Adidas","18-10-2025",1200, ProductTypes.CLOTHING,
									   "Adidas",WarrantyYears.ONE_YEAR,false,"C_195","Germany");

		Product product78=new Product("Cough Syrup","Corex","25-11-2025",110, ProductTypes.MEDICAL,
									   "Pfizer",WarrantyYears.ONE_YEAR,false,"C_196","USA");

		Product product79=new Product("Antibiotic","Azithral","02-12-2025",95, ProductTypes.MEDICAL,
									   "Alembic",WarrantyYears.ONE_YEAR,false,"A_197","India");

		Product product80=new Product("Projector","Epson","11-01-2026",35000, ProductTypes.ELECTRONICS,
									   "Epson",WarrantyYears.THREE_YEARS,false,"P_198","Japan");

		Product product81=new Product("Router","TP-Link","19-02-2026",2500, ProductTypes.ELECTRONICS,
									   "TPLink",WarrantyYears.ONE_YEAR,false,"R_199","China");

		Product product82=new Product("Bookshelf","Durian","28-03-2024",10000, ProductTypes.FURNITURE,
									   "Durian",WarrantyYears.THREE_YEARS,false,"B_200","India");									   
		
        productstore.save(product1);
        System.out.println("\n");
		
		productstore.save(product2);
        System.out.println("\n");
		
		productstore.save(product3);
        System.out.println("\n");
		
		productstore.save(product4);
        System.out.println("\n");
		
		productstore.save(product5);
        System.out.println("\n");
		
		productstore.save(product6);
        System.out.println("\n");
		
		productstore.save(product7);
        System.out.println("\n");
		
		productstore.save(product8);
        System.out.println("\n");
		
		productstore.save(product9);
        System.out.println("\n");
		
		productstore.save(product10);
        System.out.println("\n");
		
		productstore.save(product11);
        System.out.println("\n");
		
		productstore.save(product12);
        System.out.println("\n");
		
		productstore.save(product13);
        System.out.println("\n");
		
		productstore.save(product14);
        System.out.println("\n");
		
		productstore.save(product15);
        System.out.println("\n");
		
		productstore.save(product16);
        System.out.println("\n");
		
		productstore.save(product17);
        System.out.println("\n");
		
		productstore.save(product18);
        System.out.println("\n");
		
		productstore.save(product19);
        System.out.println("\n");
		
		productstore.save(product20);
        System.out.println("\n");
		
		productstore.save(product21);
        System.out.println("\n");
		
		productstore.save(product22);
        System.out.println("\n");
		
		productstore.save(product23);
        System.out.println("\n");
		
		productstore.save(product24);
        System.out.println("\n");
		
		productstore.save(product25);
        System.out.println("\n");
		
		productstore.save(product26);
        System.out.println("\n");
		
		productstore.save(product27);
        System.out.println("\n");
		
		productstore.save(product28);
        System.out.println("\n");
		
		productstore.save(product29);
        System.out.println("\n");
		
		productstore.save(product30);
        System.out.println("\n");
		
		productstore.save(product31);
        System.out.println("\n");
		
		productstore.save(product32);
        System.out.println("\n");
		
		productstore.save(product33);
        System.out.println("\n");
		
		productstore.save(product34);
        System.out.println("\n");
		
		productstore.save(product35);
        System.out.println("\n");
		
		productstore.save(product36);
        System.out.println("\n");
		
		productstore.save(product37);
        System.out.println("\n");
		
		productstore.save(product38);
        System.out.println("\n");
		
		productstore.save(product39);
        System.out.println("\n");
		
		productstore.save(product40);
        System.out.println("\n");
		
		productstore.save(product41);
        System.out.println("\n");
		
		productstore.save(product42);
        System.out.println("\n");
		
		productstore.save(product43);
        System.out.println("\n");
		
		productstore.save(product44);
        System.out.println("\n");
		
		productstore.save(product45);
        System.out.println("\n");
		
		productstore.save(product46);
        System.out.println("\n");
		
		productstore.save(product47);
        System.out.println("\n");
		
		productstore.save(product48);
        System.out.println("\n");
		
		productstore.save(product49);
        System.out.println("\n");
		
		productstore.save(product50);
        System.out.println("\n");
		
		productstore.save(product51);
        System.out.println("\n");
		
		productstore.save(product52);
        System.out.println("\n");
		
		productstore.save(product53);
        System.out.println("\n");
		
		productstore.save(product54);
        System.out.println("\n");
		
		productstore.save(product55);
        System.out.println("\n");
		
		productstore.save(product56);
        System.out.println("\n");
		
		productstore.save(product57);
        System.out.println("\n");
		
		productstore.save(product58);
        System.out.println("\n");
		
		productstore.save(product59);
        System.out.println("\n");
		
		productstore.save(product60);
        System.out.println("\n");
		
		productstore.save(product61);
        System.out.println("\n");
		
		productstore.save(product62);
        System.out.println("\n");
		
		productstore.save(product63);
        System.out.println("\n");
		
		productstore.save(product64);
        System.out.println("\n");
		
		productstore.save(product65);
        System.out.println("\n");
		
		productstore.save(product66);
        System.out.println("\n");
		
		productstore.save(product67);
        System.out.println("\n");
		
		productstore.save(product68);
        System.out.println("\n");
		
		productstore.save(product69);
        System.out.println("\n");
		
		productstore.save(product70);
        System.out.println("\n");
		
		productstore.save(product71);
        System.out.println("\n");
		
		productstore.save(product72);
        System.out.println("\n");
		
		productstore.save(product73);
        System.out.println("\n");
		
		productstore.save(product74);
        System.out.println("\n");
		
		productstore.save(product75);
        System.out.println("\n");
		
		productstore.save(product76);
        System.out.println("\n");
		
		productstore.save(product77);
        System.out.println("\n");
		
		productstore.save(product78);
        System.out.println("\n");
		
		productstore.save(product79);
        System.out.println("\n");
		
		productstore.save(product80);
        System.out.println("\n");
		
		productstore.save(product81);
        System.out.println("\n");
		
		productstore.save(product82);
        System.out.println("\n");

        
		System.out.println("Searching product by uniqeId");
        boolean ref = productstore.searchByID("HP_121");
        System.out.println("The product is found: " + ref);
		
		System.out.println("\n Searching product by uniqeId and Name");
		boolean getProduct = productstore.searchByUniqeIdAndName("I_126","Iron Box");
		System.out.println("The product is found:"+getProduct);
		
		System.out.println("\n Searching product by uniqeId, Name and origin Country");
		boolean ref2 = productstore.searchByUniqeIdAndNameAndOriginCountry("M_159","Mouse","USA");
		System.out.println("The product is found:"+ ref2);
		
		System.out.println("\n Getting Products of type ELECTRONICS");
        productstore.getAllByType(ProductTypes.ELECTRONICS);
		
		System.out.println("\n Getting Products Same warranty years");
        productstore.getAllByWarrantyYears(WarrantyYears.ONE_YEAR);
		
		System.out.println("\n All Products");
        productstore.printAllProducts();
		
		
		
		
    }
}