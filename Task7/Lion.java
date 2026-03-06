class Lion{

	String name;
	int age;
	double weight;
	boolean wild;
	boolean healthy;

	LionType lionType;
	LionColor lionColor;
	LionHabitat lionHabitat;
	LionFood lionFood;
	LionOrigin lionOrigin;

	Lion(String name,int age,double weight,boolean wild,boolean healthy,
	     LionType lionType,LionColor lionColor,LionHabitat lionHabitat,
	     LionFood lionFood,LionOrigin lionOrigin){

		this.name=name;
		this.age=age;
		this.weight=weight;
		this.wild=wild;
		this.healthy=healthy;

		this.lionType=lionType;
		this.lionColor=lionColor;
		this.lionHabitat=lionHabitat;
		this.lionFood=lionFood;
		this.lionOrigin=lionOrigin;

		System.out.println("Lion Details");
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Weight:"+this.weight);
		System.out.println("Wild:"+this.wild);
		System.out.println("Healthy:"+this.healthy);
		System.out.println("Type:"+this.lionType);
		System.out.println("Color:"+this.lionColor);
		System.out.println("Habitat:"+this.lionHabitat);
		System.out.println("Food:"+this.lionFood);
		System.out.println("Origin:"+this.lionOrigin);
	}
}