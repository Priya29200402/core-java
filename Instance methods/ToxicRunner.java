class ToxicRunner{
    public static void main(String[] args){

        Toxic toxic1 = new Toxic("Sulfuric Acid", "Acid", "H2SO4",
                "Colorless", "Liquid", 5.0,
                false, false,
                "Cool Storage", "High",
                "ChemCorp", "12-12-2027",
                "USA", 1.2, "Odorless",
                "Wear Gloves & Goggles", "Plastic Can",
                "Industrial", "T001", "LabSuppliers");

        Toxic toxic2 = new Toxic("Hydrochloric Acid", "Acid", "HCl",
                "Colorless", "Liquid", 3.0,
                false, false,
                "Ventilated Area", "High",
                "AcidMakers", "10-10-2027",
                "Germany", 2.0, "Pungent",
                "Use Mask & Gloves", "Glass Bottle",
                "Laboratory", "T002", "ChemWorld");

        Toxic toxic3 = new Toxic("Sodium Cyanide", "Salt", "NaCN",
                "White", "Solid", 2.0,
                false, false,
                "Dry Storage", "Very High",
                "ToxicLabs", "08-08-2026",
                "India", 11.0, "Faint Almond",
                "Full Protective Suit", "Steel Drum",
                "Mining", "T003", "MineSuppliers");

        Toxic toxic4 = new Toxic("Mercury", "Metal", "Hg",
                "Silver", "Liquid", 1.5,
                false, false,
                "Sealed Container", "High",
                "MetalWorks", "05-05-2028",
                "China", 7.0, "Odorless",
                "Avoid Direct Contact", "Glass Container",
                "Industrial", "T004", "GlobalChem");

        Toxic toxic5 = new Toxic("Benzene", "Hydrocarbon", "C6H6",
                "Colorless", "Liquid", 4.0,
                true, false,
                "Cool & Ventilated", "High",
                "PetroChem", "03-03-2027",
                "USA", 7.0, "Sweet",
                "Keep Away From Fire", "Metal Can",
                "Petroleum", "T005", "FuelSuppliers");

        Toxic toxic6 = new Toxic("Ammonia", "Gas", "NH3",
                "Colorless", "Gas", 6.0,
                true, false,
                "Pressurized Tank", "Medium",
                "AgroChem", "09-09-2026",
                "India", 11.5, "Sharp",
                "Use in Open Area", "Gas Cylinder",
                "Agriculture", "T006", "FarmSuppliers");

        Toxic toxic7 = new Toxic("Chlorine", "Halogen", "Cl2",
                "Greenish", "Gas", 2.5,
                false, false,
                "Gas Tank", "High",
                "WaterTech", "07-07-2026",
                "UK", 7.0, "Strong",
                "Use Mask & Ventilation", "Cylinder",
                "Water Treatment", "T007", "AquaSuppliers");

        Toxic toxic8 = new Toxic("Arsenic", "Metalloid", "As",
                "Grey", "Solid", 1.0,
                false, false,
                "Dry Sealed", "Very High",
                "ElementCorp", "01-01-2029",
                "Russia", 7.0, "Garlic-like",
                "Avoid Inhalation", "Sealed Box",
                "Industrial", "T008", "ChemStore");

        Toxic toxic9 = new Toxic("Formaldehyde", "Aldehyde", "CH2O",
                "Colorless", "Liquid", 3.5,
                true, false,
                "Cool Place", "Medium",
                "BioLabs", "11-11-2026",
                "Japan", 3.0, "Pungent",
                "Use Gloves", "Plastic Bottle",
                "Medical", "T009", "MediSuppliers");

        Toxic toxic10 = new Toxic("Uranium", "Radioactive Metal", "U",
                "Silver Grey", "Solid", 0.5,
                false, true,
                "Radiation Shielded", "Extreme",
                "NuclearCorp", "12-12-2030",
                "USA", 7.0, "Odorless",
                "Radiation Suit Required", "Lead Container",
                "Nuclear", "T010", "EnergySuppliers");

        toxic1.getToxicInfo();
        System.out.println("----------------------");
        toxic2.getToxicInfo();
        System.out.println("----------------------");
        toxic3.getToxicInfo();
        System.out.println("----------------------");
        toxic4.getToxicInfo();
        System.out.println("----------------------");
        toxic5.getToxicInfo();
        System.out.println("----------------------");
        toxic6.getToxicInfo();
        System.out.println("----------------------");
        toxic7.getToxicInfo();
        System.out.println("----------------------");
        toxic8.getToxicInfo();
        System.out.println("----------------------");
        toxic9.getToxicInfo();
        System.out.println("----------------------");
        toxic10.getToxicInfo();
    }
}