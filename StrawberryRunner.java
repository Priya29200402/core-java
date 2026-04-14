class StrawberryRunner{
    public static void main(String[] args) {

        Strawberry strawberry1 = new Strawberry();
        System.out.println("------ Strawberry 1 ------");
        System.out.println("color:"+strawberry1.color);
        System.out.println("Weight:"+strawberry1.weight);
        System.out.println("Taste:"+strawberry1.taste);
        System.out.println("Fresh:"+strawberry1.fresh);
        System.out.println("Origin:"+strawberry1.origin);
		System.out.println("===========================");


        Strawberry strawberry2 = new Strawberry("Red");
        System.out.println("------ Strawberry 2 ------");
        System.out.println("color:"+strawberry2.color);
        System.out.println("Weight:"+strawberry2.weight);
        System.out.println("Taste:"+strawberry2.taste);
        System.out.println("Fresh:"+strawberry2.fresh);
        System.out.println("Origin:"+strawberry2.origin);
		System.out.println("===========================");

        Strawberry strawberry3 = new Strawberry("Dark Red", 15.5);
        System.out.println("------ Strawberry 3 ------");
        System.out.println("color:"+strawberry3.color);
        System.out.println("Weight:"+strawberry3.weight);
        System.out.println("Taste:"+strawberry3.taste);
        System.out.println("Fresh:"+strawberry3.fresh);
        System.out.println("Origin:"+strawberry3.origin);
		System.out.println("===========================");

        Strawberry strawberry4 = new Strawberry("Bright Red", 18.0, "Sweet");
        System.out.println("------ Strawberry 4 ------");
        System.out.println("color:"+strawberry4.color);
        System.out.println("Weight:"+strawberry4.weight);
        System.out.println("Taste:"+strawberry4.taste);
        System.out.println("Fresh:"+strawberry4.fresh);
        System.out.println("Origin:"+strawberry4.origin);
		System.out.println("===========================");
        Strawberry strawberry5 = new Strawberry("Pinkish Red", 20.0, "Sweet", true);
        System.out.println("------ Strawberry 5 ------");
        System.out.println("color:"+strawberry5.color);
        System.out.println("Weight:"+strawberry5.weight);
        System.out.println("Taste:"+strawberry5.taste);
        System.out.println("Fresh:"+strawberry5.fresh);
        System.out.println("Origin:"+strawberry5.origin);
		System.out.println("===========================");

        Strawberry strawberry6 = new Strawberry("Premium Red", 25.0, "Very Sweet", true, "Ooty");
        System.out.println("------ Strawberry 6 ------");
        System.out.println("color:"+strawberry6.color);
        System.out.println("Weight:"+strawberry6.weight);
        System.out.println("Taste:"+strawberry6.taste);
        System.out.println("Fresh:"+strawberry6.fresh);
        System.out.println("Origin:"+strawberry6.origin);
		System.out.println("===========================");
    }
}