class Cell{

    String type;
    String shape;
    double size;
    String function;
    String organism;
    boolean nucleusPresent;
    String cellWallType;
    String cytoplasmType;
    String chromosomeCount;
    String reproductionType;
    String discoveryYear;
    String discoveredBy;
    String color;
    String category;
    String condition;
    String laboratory;
    String country;
    String code;
    String remarks;
    String sampleId;

    Cell(String type, String shape, double size, String function,
         String organism, boolean nucleusPresent, String cellWallType,
         String cytoplasmType, String chromosomeCount,
         String reproductionType, String discoveryYear,
         String discoveredBy, String color, String category,
         String condition, String laboratory, String country,
         String code, String remarks, String sampleId) {

        this.type = type;
        this.shape = shape;
        this.size = size;
        this.function = function;
        this.organism = organism;
        this.nucleusPresent = nucleusPresent;
        this.cellWallType = cellWallType;
        this.cytoplasmType = cytoplasmType;
        this.chromosomeCount = chromosomeCount;
        this.reproductionType = reproductionType;
        this.discoveryYear = discoveryYear;
        this.discoveredBy = discoveredBy;
        this.color = color;
        this.category = category;
        this.condition = condition;
        this.laboratory = laboratory;
        this.country = country;
        this.code = code;
        this.remarks = remarks;
        this.sampleId = sampleId;
    }

    void getCellInfo() {
        System.out.println("Type: " + type);
        System.out.println("Shape: " + shape);
        System.out.println("Size: " + size);
        System.out.println("Function: " + function);
        System.out.println("Organism: " + organism);
        System.out.println("Nucleus Present: " + nucleusPresent);
        System.out.println("Cell Wall Type: " + cellWallType);
        System.out.println("Cytoplasm Type: " + cytoplasmType);
        System.out.println("Chromosome Count: " + chromosomeCount);
        System.out.println("Reproduction Type: " + reproductionType);
        System.out.println("Discovery Year: " + discoveryYear);
        System.out.println("Discovered By: " + discoveredBy);
        System.out.println("Color: " + color);
        System.out.println("Category: " + category);
        System.out.println("Condition: " + condition);
        System.out.println("Laboratory: " + laboratory);
        System.out.println("Country: " + country);
        System.out.println("Code: " + code);
        System.out.println("Remarks: " + remarks);
        System.out.println("Sample ID: " + sampleId);
    }
}