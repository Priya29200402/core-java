class CellRunner{
    public static void main(String[] args) {

        Cell cell1 = new Cell("Neuron", "Star", 0.02, "Transmit impulses",
                "Human", true, "Absent", "Gel-like",
                "46", "Mitosis", "1665",
                "Robert Hooke", "Transparent", "Animal Cell",
                "Healthy", "AIIMS Lab", "India",
                "C001", "Normal functioning", "S001");

        Cell cell2 = new Cell("Red Blood Cell", "Biconcave", 0.008, "Carry oxygen",
                "Human", false, "Absent", "Fluid",
                "0", "Mitosis", "1674",
                "Antonie van Leeuwenhoek", "Red", "Animal Cell",
                "Healthy", "Apollo Lab", "India",
                "C002", "No abnormalities", "S002");

        Cell cell3 = new Cell("White Blood Cell", "Irregular", 0.015, "Fight infection",
                "Human", true, "Absent", "Granular",
                "46", "Mitosis", "1674",
                "Antonie van Leeuwenhoek", "White", "Animal Cell",
                "Active", "Fortis Lab", "India",
                "C003", "High immunity", "S003");

        Cell cell4 = new Cell("Muscle Cell", "Cylindrical", 0.05, "Movement",
                "Human", true, "Absent", "Dense",
                "46", "Mitosis", "1839",
                "Theodor Schwann", "Pink", "Animal Cell",
                "Healthy", "Manipal Lab", "India",
                "C004", "Strong fibers", "S004");

        Cell cell5 = new Cell("Plant Cell", "Rectangular", 0.03, "Photosynthesis",
                "Plant", true, "Cellulose",
                "Thick", "20", "Mitosis", "1665",
                "Robert Hooke", "Green", "Plant Cell",
                "Healthy", "Botany Lab", "India",
                "C005", "Chloroplast present", "S005");

        Cell cell6 = new Cell("Bacterial Cell", "Rod", 0.002, "Reproduction",
                "Bacteria", false, "Peptidoglycan",
                "Simple", "1", "Binary Fission", "1683",
                "Antonie van Leeuwenhoek", "Colorless", "Prokaryotic",
                "Active", "Micro Lab", "India",
                "C006", "Rapid growth", "S006");

        Cell cell7 = new Cell("Stem Cell", "Round", 0.01, "Differentiate",
                "Human", true, "Absent",
                "Gel-like", "46", "Mitosis", "1961",
                "James Till", "Transparent", "Specialized",
                "Preserved", "Research Lab", "India",
                "C007", "High regenerative capacity", "S007");

        Cell cell8 = new Cell("Sperm Cell", "Tadpole", 0.006, "Fertilization",
                "Human", true, "Absent",
                "Fluid", "23", "Meiosis", "1677",
                "Antonie van Leeuwenhoek", "White", "Reproductive",
                "Healthy", "IVF Lab", "India",
                "C008", "Motile", "S008");

        Cell cell9 = new Cell("Egg Cell", "Round", 0.1, "Reproduction",
                "Human", true, "Absent",
                "Dense", "23", "Meiosis", "1827",
                "Karl Ernst von Baer", "Yellowish", "Reproductive",
                "Healthy", "IVF Lab", "India",
                "C009", "Large size", "S009");

        Cell cell10 = new Cell("Skin Cell", "Flat", 0.02, "Protection",
                "Human", true, "Absent",
                "Layered", "46", "Mitosis", "1839",
                "Theodor Schwann", "Brown", "Epithelial",
                "Healthy", "Derm Lab", "India",
                "C010", "Protective barrier", "S010");

        
        cell1.getCellInfo();
		System.out.println("-----------------------");
		cell2.getCellInfo();
		System.out.println("-----------------------");
		cell3.getCellInfo();
		System.out.println("-----------------------");
		cell4.getCellInfo();
		System.out.println("-----------------------");
		cell5.getCellInfo();
		System.out.println("-----------------------");
		cell6.getCellInfo();
		System.out.println("-----------------------");
		cell7.getCellInfo();
		System.out.println("-----------------------");
		cell8.getCellInfo();
		System.out.println("-----------------------");
		cell9.getCellInfo();
		System.out.println("-----------------------");
		cell10.getCellInfo();
		
    }
}