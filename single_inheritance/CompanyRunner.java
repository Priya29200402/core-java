class CompanyRunner{
	public static void main(String[] args){
		CarCompany car=new CarCompany();
		car.name="Renault";
		System.out.println("Company Name:"+car.name);
		car.carModel="Triber";
		System.out.println("Car Model:"+car.carModel);
		
		car.getInfo();
		car.getModelInfo();
	}
}