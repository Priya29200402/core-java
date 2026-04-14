class WallPaperRunner{
    public static void main(String[] args) {

        WallPaper wallPaper1 = new WallPaper("Asian Paints", "White", "Floral", "Vinyl",
											1200.50, 0.53, 10.0, "Smooth",
											true, true, "India",
											50, "Modern", "Living Room",
											"High", "Pre-pasted", "Matte",
											"ABC Suppliers", "2 Years", "WP001");

        WallPaper wallPaper2 = new WallPaper("Nilaya", "Blue", "Geometric", "Paper",
											1500.00, 0.60, 9.5, "Textured",
											false, true, "India",
											30, "Contemporary", "Bedroom",
											"Medium", "Adhesive Required", "Glossy",
											"XYZ Traders", "1 Year", "WP002");

        WallPaper wallPaper3 = new WallPaper("Marshalls", "Beige", "Abstract", "Fabric",
											1800.75, 0.55, 10.5, "Rough",
											true, false, "UK",
											20, "Luxury", "Hall",
											"High", "Pre-pasted", "Satin",
											"HomeDeco Ltd", "3 Years", "WP003");

        WallPaper wallPaper4 = new WallPaper("D'Decor", "Grey", "Striped", "Vinyl",
											1100.00, 0.52, 9.8, "Smooth",
											true, true, "India",
											40, "Classic", "Office",
											"High", "Self-adhesive", "Matte",
											"Decor World", "2 Years", "WP004");

        WallPaper wallPaper5 = new WallPaper("Excel", "Pink", "Floral", "Paper",
											950.25, 0.50, 10.0, "Soft",
											false, true, "USA",
											60, "Vintage", "Kids Room",
											"Medium", "Glue Required", "Glossy",
											"Global Interiors", "1 Year", "WP005");

        WallPaper wallPaper6 = new WallPaper("WallMantra", "Green", "Nature", "Vinyl",
											1300.00, 0.54, 10.2, "Textured",
											true, true, "India",
											35, "Eco", "Dining Room",
											"High", "Pre-pasted", "Matte",
											"EcoHomes", "2 Years", "WP006");

        WallPaper wallPaper7 = new WallPaper("Zara Home", "Brown", "Wood Finish", "Fabric",
											2100.00, 0.65, 11.0, "Rough",
											false, false, "Spain",
											15, "Premium", "Hotel",
											"Very High", "Adhesive Required", "Satin",
											"Luxury Decor", "5 Years", "WP007");

        WallPaper wallPaper8 = new WallPaper("Home Centre", "Yellow", "Cartoon", "Paper",
											800.00, 0.48, 9.0, "Smooth",
											false, true, "India",
											70, "Kids", "Play Room",
											"Low", "Glue Required", "Glossy",
											"Kids Decor", "6 Months", "WP008");

        WallPaper wallPaper9 = new WallPaper("IKEA", "Black", "Minimal", "Vinyl",
											1700.00, 0.58, 10.0, "Matte",
											true, true, "Sweden",
											25, "Minimalist", "Studio",
											"High", "Self-adhesive", "Matte",
											"Scandi Supplies", "3 Years", "WP009");

        WallPaper wallPaper10 = new WallPaper("Pepperfry", "Purple", "Royal", "Fabric",
												1950.50, 0.60, 10.8, "Velvet",
												true, false, "India",
												18, "Royal", "Bedroom",
												"High", "Adhesive Required", "Glossy",
												"Royal Interiors", "4 Years", "WP010");

        wallPaper1.getWallPaperInfo();
        System.out.println("========================");
        wallPaper2.getWallPaperInfo();
        System.out.println("========================");
        wallPaper3.getWallPaperInfo();
        System.out.println("========================");
        wallPaper4.getWallPaperInfo();
        System.out.println("========================");
        wallPaper5.getWallPaperInfo();
        System.out.println("========================");
        wallPaper6.getWallPaperInfo();
        System.out.println("========================");
        wallPaper7.getWallPaperInfo();
        System.out.println("========================");
        wallPaper8.getWallPaperInfo();
        System.out.println("========================");
        wallPaper9.getWallPaperInfo();
        System.out.println("========================");
        wallPaper10.getWallPaperInfo();
    }
}