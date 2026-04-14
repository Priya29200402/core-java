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
		 }
		void lionData(){

		System.out.println("Lion Details");
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Weight:"+this.weight);
		System.out.println("Wild:"+this.wild);
		System.out.println("Healthy:"+this.healthy);
		
		if(this.lionType!=null){
			this.lionType.getData();
		}
		else{
			System.out.println("Lion type is NUll");
		}
		if(this.lionColor!=null){
			this.lionColor.getData();
		}
		else{
		   System.out.println("Lion Color is NUll");	
		}
		if(this.lionHabitat!=null){
			this.lionHabitat.getData();
		}
		else{
		   System.out.println("Lion Habitat  is NUll");	
		}
		if(this.lionFood!=null){
			this.lionFood.getData();
		}
		else{
		   System.out.println("Lion Food is NUll");		
		}
		if(this.lionOrigin!=null){
			this.lionOrigin.getData();
		}
		else{
			System.out.println("Lion Origin is Null");
		}
	}
}