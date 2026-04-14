class Napkin{
	NapkinSize size;
	Material material;
	String color;
	
	Napkin(NapkinSize size, Material material, String color){
		this.size=size;
		this.material=material;
		this.color=color;
	}
	void printInfo(){
		System.out.println("Napkin Size:"+this.size);
		System.out.println("Napkin color:"+this.color);
		
		if(this.material!=null){
			this.material.getData();
		}
		else{
			System.out.println("Material Cannot be null");
		}
	}
}